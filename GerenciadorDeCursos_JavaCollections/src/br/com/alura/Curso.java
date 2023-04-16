package br.com.alura;

import java.util.*;

public class Curso {
    private String nome;
    private String instrutor;
    private List<Aula> aulas = new LinkedList<Aula>();
    private Set<Aluno> alunos = new HashSet<>();
    //criado um map.  dado um número inteiro mapeia um número correspondente
    private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();

    //construtor
    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    //getters
    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas); // impede utilizar os métodos de List como add, remove, etc
    }

    //métodos
    public void adiciona(Aula aula){
        this.aulas.add(aula);
    }

    // DO JAVA 8
    public int getTempoTotal(){
        return this.aulas.stream().mapToInt(Aula::getTempo).sum();
    }

    // MESMO OBJETIVO DO MÉTODO ACIMA
//    public int getTempoTotal(){
//        int tempoTotal = 0;
//        for(Aula aula : aulas){
//            tempoTotal += aula.getTempo();
//        }
//        return tempoTotal;
//    }

    @Override
    public String toString() {
        return "[Curso: " + this.nome + ", tempo total: " + this.getTempoTotal() + ", "
                + " aulas: " + this.aulas + "]";
    }

    public void matricula(Aluno aluno) {
        this.alunos.add(aluno);
        this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
    }

    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos);
    }

    public boolean estaMatriculado(Aluno aluno) {
        return this.alunos.contains(aluno);
    }

    public Aluno buscaMatriculado(int numero) {
        if(!matriculaParaAluno.containsKey(numero)) // se não contem o numero
            throw new NoSuchElementException("número de matrícula não encontrado");
        return matriculaParaAluno.get(numero);
    }
}
