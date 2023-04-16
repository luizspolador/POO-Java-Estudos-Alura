package br.com.alura;

public class TestaBuscaAlunosNoCurso {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as coleções java", "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 24));

        Aluno a1 = new Aluno("Luiz Spolador", 34672);
        Aluno a2 = new Aluno("Maria Aparecida", 542464);
        Aluno a3 = new Aluno("Valternir Jose", 684141);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);

        System.out.println("Quem é o aluno com matrícula 5617?");
        Aluno aluno = javaColecoes.buscaMatriculado(6513);
        System.out.println("aluno: " + aluno);
    }
}
