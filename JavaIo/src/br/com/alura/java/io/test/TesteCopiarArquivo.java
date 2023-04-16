package br.com.alura.java.io.test;

import java.io.*;
import java.net.Socket;

public class TesteCopiarArquivo {
    public static void main(String[] args) throws IOException {

        Socket s = new Socket(); // rede

        InputStream fis = s.getInputStream(); // entrada por rede //System.in; -->  entrada pelo teclado
        Reader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        OutputStream fos = s.getOutputStream(); // --> saída por rede // new FileOutputStream("texto2.txt"); // System.out --> saída pelo teclado
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        String linha = br.readLine();

        while(linha != null && !linha.isEmpty()){ // linha não deve ser diferente de null e ser vazia
            bw.write(linha);
            bw.newLine();
            bw.flush(); // imprime na tela após Enter
            linha = br.readLine();
        }

        br.close();
        bw.close();
    }
}
