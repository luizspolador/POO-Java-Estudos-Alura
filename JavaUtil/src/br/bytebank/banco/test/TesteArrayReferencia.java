package br.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencia {
    public static void main(String[] args) {

        //ContaCorrente[] contas = new ContaCorrente[5]; --> criação do objeto contas do tipo ContaCorrente

        Object[] referencias = new Object[5]; // array mais genérico possível
        Conta[] contas = new Conta[5];
        ContaCorrente cc1 = new ContaCorrente(222, 111); // criação do obj cc1 do tipo ContaCorrente
        contas[0] = cc1;

        ContaPoupanca cc2 = new ContaPoupanca(222, 333); //criação do obj cc2 do tipo ContaCorrente
        contas[1] = cc2;

        System.out.println(contas[0].getNumero()); // acessa cc1 e busca o número -- imprime 111
        System.out.println(contas[1].getNumero()); // acessa cc2 e busca o numero -- imprime 333

        ContaPoupanca ref = (ContaPoupanca) contas[1]; // cast --> transformar um tipo mais genérico (Conta) para um mais específico (CP)
        System.out.println(ref.getNumero());

        Cliente cliente = new Cliente();
        referencias[2] = cliente;

        // FORMA LITERAL CRIAÇÃO DE ARRAYS
        // int[] refs = {1,2,3,4,5};
    }
}
