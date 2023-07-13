import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do filme: ");
        String filme = sc.nextLine();
        System.out.println("filme: " + filme);
        System.out.println("qual o ano de lançamento? ");
        int ano = sc.nextInt();
        System.out.println("Ano: " + ano);

        sc.close();
    }
}
