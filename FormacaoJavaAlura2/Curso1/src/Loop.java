import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double soma = 0;
        //double nota = 0;

        for (int i = 1; i <= 3; i++) {
            System.out.print("Dê a " + i + "º nota: ");
            double nota = sc.nextDouble();
//            soma = soma + nota;
            soma += nota;
        }

        System.out.println("soma das notas: " + soma);
        double media = soma / 3;
        System.out.println(String.format("média das notas é %.2f", media));
    }
}
