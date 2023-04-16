package br.com.alura.java.io.test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter {
    public static void main(String[] args) throws IOException {
        // fluxo de saída com arquivo

//        OutputStream fos = new FileOutputStream("texto2.txt");
//        Writer osw = new OutputStreamWriter(fos);
//        BufferedWriter bw = new BufferedWriter(osw);

        FileWriter fw = new FileWriter("texto3");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("saihdosajdoisajdoisajdoisajdoisajdpsajdpsajd");
        bw.newLine();
        bw.newLine(); // só pode usar com o BufferedWriter
//        bw.write(System.lineSeparator());
//        bw.write(System.lineSeparator());
        // OUTRA OOÇÃO DE PULAR LINHA --> fw.write("\r\n"); // indica nova linha - caracter varia entre s.o.
        bw.write("dsfndsjfovjoidfjoigmjfdsoijnfdsoinhifdczcjiusjdfoighghfdsiuhg");

        bw.close();
    }
}
