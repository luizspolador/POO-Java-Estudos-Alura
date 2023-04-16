package br.bytebank.banco.test;

public class TesteArrayDePrimitivos {
    public static void main(String[] args) {

        int[] idades = new int[5];
        idades[0] = 29;
        idades[1] = 42;
        idades[2] = 53;
        idades[3] = 64;
        idades[4] = 24;
        int idade1 = idades[0];

        System.out.println(idade1);
        System.out.println(idades.length);

        for(int i = 0; i < idades.length; i++){
            idades[i] = i * i;
        }

        for(int i = 0; i < idades.length; i++){
            System.out.println(idades[i]);
        }

    }
}
