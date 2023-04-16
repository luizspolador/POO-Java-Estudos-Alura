package br.bytebank.banco.test;

public class TesteArray {
    public static void main(String[] args) {
        int[] idades =  new int[5]; // um array tmb é um objeto
        idades[0] = 29;
        idades[1] = 39;
        idades[2] = 56;
        idades[3] = 89;
        idades[4] = 31;

        int idade1 = idades[0];

        System.out.println(idade1);
        System.out.println(idades.length); // numero de posições

        for (int i=0; i < idades.length; i++){
            idades[i] = i * i;
        }

        for (int i=0; i < idades.length; i++){
            System.out.println(idades[i]);;
        }

    }
}
