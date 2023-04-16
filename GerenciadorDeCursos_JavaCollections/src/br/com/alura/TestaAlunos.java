package br.com.alura;

import java.util.*;

public class TestaAlunos {
    public static void main(String[] args) {
        // Set: não mantém uma ordem e não aceita elementos repetidos
        // ganha em vel e performance
        Collection<String> alunos = new HashSet<>();
        alunos.add("Luiz Spolador");
        alunos.add("Sarah Lott");
        alunos.add("Mariana Larissa");
        alunos.add("Otávio Dangelis");
        alunos.add("Valternir José");
        alunos.add("Maria Aparecida");
        System.out.println(alunos);

        boolean luizEstaMatriculado = alunos.contains("Luiz Spolador");
        System.out.println(alunos.size());
        alunos.remove("Otávio Dangelis");
        System.out.println(alunos.size());
        System.out.println(luizEstaMatriculado); // true

//        for (String aluno: alunos) {
//            System.out.println(aluno);
//        }
        // MESMA COISA QUE O FOR ACIMA
        alunos.forEach(aluno -> {
            System.out.println(aluno);
        });

        List<String> alunosEmLista = new ArrayList<>(alunos);

    }
}
