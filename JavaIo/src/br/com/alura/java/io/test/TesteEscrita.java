package br.com.alura.java.io.test;

import java.io.*;

public class TesteEscrita {
    public static void main(String[] args) throws IOException {
        // fluxo de saída com arquivo

        OutputStream fos = new FileOutputStream("texto2.txt");
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        bw.write("auwhiuvnoaejnvroiajsivfaespokvmaevneajr");
        bw.newLine();
        bw.newLine();
        bw.write("dsfndsjfovjoidfjoigmjfdsoijnfdsoinhifdczcjiusjdfoighghfdsiuhg");

        bw.close();
    }
}
