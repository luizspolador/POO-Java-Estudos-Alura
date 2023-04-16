package br.com.alura.java.io.test;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class TesteEscritaPrintStreamPrintWriter {
    public static void main(String[] args) throws IOException {

        PrintWriter pw = new PrintWriter("texto5.txt", StandardCharsets.UTF_8);

        PrintStream ps = new PrintStream(new File("texto4.txt"));
        ps.println("shusahdajdoisajdoiasjdisajdisajdisajdisajdoisajdijsad");
        ps.println();
        ps.println("suahdiusadiusahdiusahdiusa dsacsadc dsascascd");

        ps.close();
        pw.close();
    }
}
