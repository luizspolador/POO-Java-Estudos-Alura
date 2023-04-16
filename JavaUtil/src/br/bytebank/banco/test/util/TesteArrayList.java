package br.bytebank.banco.test.util;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class TesteArrayList {
    public static void main(String[] args) {
        //<> --> generics
        List<Conta> lista = new ArrayList<Conta>(); // <Conta> -- so guarda dados do tipo Conta

        Conta cc = new ContaCorrente(22, 11);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(22, 22);
        lista.add(cc2);

        System.out.println("Tamanho: " + lista.size()); // verifica o tamanho do array - número de elementos
        Conta ref = lista.get(0); // ref pega o índice 0 do array
        System.out.println(ref.getNumero()); // 11
        System.out.println(ref.getAgencia()); // 22

        lista.remove(0);
        System.out.println("Tamanho após remoção: " + lista.size());

        Conta cc3 = new ContaCorrente(33, 55);
        lista.add(cc3);
        Conta cc4 = new ContaCorrente(44, 77);
        lista.add(cc4);

        // interar - acessar cada elemento
        for (int i = 0; i < lista.size(); i++){
            Object oRef = lista.get(i);
            System.out.println(oRef);
        }
        System.out.println("----------------------------------------------");

        for (Conta conta : lista){
            System.out.println(conta);
        }

    }
}
