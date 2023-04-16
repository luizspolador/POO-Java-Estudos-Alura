package br.com.alura;

import java.util.Iterator;
import java.util.Set;

public class TestaComCursoAluno {
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

        System.out.println("Todos os alunos matriculados: ");
        javaColecoes.getAlunos().forEach(a -> {
            System.out.println(a);
        });

        // ANTIGO:
//        Set<Aluno> alunos = javaColecoes.getAlunos();
//        Iterator<Aluno> interador = alunos.iterator();
//        while (interador.hasNext()){
//            Aluno proximo = interador.next();
//            System.out.println(proximo);
//        }

        System.out.println("O aluno " + a1 + " está matriculado?");
        System.out.println(javaColecoes.estaMatriculado(a1));

        Aluno spolador = new Aluno("Luiz Spolador", 34672);
        System.out.println("O Luiz Spolador está matriculado? ");
        System.out.println(javaColecoes.estaMatriculado(spolador));

        System.out.println("O a1 é equals ao spolador?");
        System.out.println(a1.equals(spolador));

        //obrigatoriamente o segundo é true
        System.out.println(a1.hashCode() == spolador.hashCode());
    }
}
