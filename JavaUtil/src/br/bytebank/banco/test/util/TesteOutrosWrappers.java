package br.bytebank.banco.test.util;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrappers {
    public static void main(String[] args) {

        Integer idadeRef = Integer.valueOf(29); // autoboxing
        System.out.println(idadeRef.intValue()); // transforma em um primitivo - unboxing

        Double dRef = Double.valueOf(3.2); // autoboxing
        System.out.println(dRef.doubleValue()); // unboxing

        Boolean bRef = Boolean.FALSE;
        System.out.println(bRef.booleanValue());

        Number refNumero = Float.valueOf(29.9f);

        List<Number> lista = new ArrayList<Number>();
        lista.add(32.6);
        lista.add(10);
        lista.add(46.89f);
    }
}
