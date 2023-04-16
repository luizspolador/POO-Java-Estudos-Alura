package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {
    public static void main(String[] args) {
        String aula1 = "Conhecendo mais de listas";
        String aula2 = "Modelando a classe aula";
        String aula3 = "Trabalhando com cursos e sets";

        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);

        System.out.println(aulas);

        aulas.remove(0);
        System.out.println(aulas);

        //para cada String aula dentro de aulas(lista) faça
        for (String aula: aulas) {
            System.out.println("Aula: " + aula);
        }

        String primeiraAula = aulas.get(0);
        System.out.println("A primeira aula é: " + primeiraAula);

        for(int i=0; i<aulas.size(); i++){
            System.out.println("aula: " + aulas.get(i));
        }

        // para cada aula que está dentro de aulas faça
        aulas.forEach(aula -> {
            System.out.println("percorrendo: ");
            System.out.println("Aula " + aula);
        });

        System.out.println("---------------");
        aulas.add("Aumentando nosso conhecimento");
        Collections.sort(aulas);
        System.out.println(aulas);

    }
}
