package br.com.alura.java.io.test;

import java.io.*;

public class TesteSerializacaoCliente {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        Cliente cliente = new Cliente();
//        cliente.setNome("Luiz");
//        cliente.setProfissao("Dev");
//        cliente.setCpf("94020050402");
//
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
//        oos.writeObject(cliente);
//        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
        Cliente cliente = (Cliente) ois.readObject();
        ois.close();
        System.out.println(cliente.getNomeCpf());
    }
}
