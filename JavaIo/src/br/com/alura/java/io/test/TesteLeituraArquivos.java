package br.com.alura.java.io.test;

import java.io.*;

public class TesteLeituraArquivos {
    public static void main(String[] args) throws IOException {
        // fluxo de entrada com arquivo

        // stream --> relacionado a bytes
        // reader --> relacionado a caracteres
        InputStream fis = new FileInputStream("texto.txt");
        Reader isr = new InputStreamReader(fis, "UTF-8");
        BufferedReader br = new BufferedReader(isr);

        String linha = br.readLine();

        while(linha != null){
            System.out.println(linha);
            linha = br.readLine();
        }

        br.close();
    }
}
