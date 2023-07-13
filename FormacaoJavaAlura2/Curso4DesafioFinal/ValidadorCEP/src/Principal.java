import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        ConsultaCep consultaCep = new ConsultaCep();

        System.out.println("Digite um CEP: ");
        var cep = teclado.nextLine();
        try{
            Endereco endereco = consultaCep.buscaEndereco(cep);
            System.out.println(endereco);
            GeradorDeArquivo geradorDeArquivo = new GeradorDeArquivo();
            geradorDeArquivo.geraJson(endereco);
        } catch (RuntimeException | IOException e){
            System.out.println(e.getMessage());
            System.out.println("finalizado");
        }


    }
}
