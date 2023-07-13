import java.util.Scanner;

public class DesafioFinal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("***************************************************");
        System.out.println("Dados iniciais do cliente: ");
        System.out.print("\nNome: ");
        String nome = sc.nextLine();
        System.out.println("Tipo de conta: CORRENTE OU POUPANÇA?");
        String tipo = sc.nextLine();
        System.out.println("Saldo: ");
        double saldo = sc.nextDouble();
        System.out.println("\n***************************************************");
        System.out.println("\nOPERAÇÕES");

        int opcao = 0;
        String menu = """
                Digite sua opção
                1 - consultar saldo
                2 - Transferir valor
                3 - Receber valor
                4 - Sair
                """;
        while (opcao != 4){
            System.out.println(menu);
            opcao = sc.nextInt();

            if (opcao == 1){
                System.out.println("Saldo atualizado: R$" + saldo);
            } else if (opcao == 2){
                System.out.println("valor para transferência: ");
                double valor = sc.nextDouble();
                if (valor > saldo){
                    System.out.println("não podemos transferir este valor, visto o saldo é insuficiente");
                } else {
                    saldo -= valor;
                    System.out.println("saldo atualizado após transferência: " + saldo);
                }
            } else if (opcao == 3){
                System.out.println("valor recebido: ");
                double valor =  sc.nextDouble();
                saldo += valor;
                System.out.println("saldo após valor recebido: " + saldo);
            } else if (opcao != 4){
                System.out.println("opção inválida, por favor, digite novamente");
            } else {
                System.out.println("fim da aplicação");
            }
        }
    }
}
