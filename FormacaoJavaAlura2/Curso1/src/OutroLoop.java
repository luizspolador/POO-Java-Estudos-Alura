import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double soma = 0;
        double nota = 0;
        int totalNotas = 0;

        while(nota != -1){
            System.out.print("Informe uma nota ou digite -1 para sair ");
            nota = sc.nextDouble();
            if(nota != -1){
                soma += nota;
                totalNotas++;
            }
        }

        System.out.println("Média: " + soma / totalNotas);




    }
}
