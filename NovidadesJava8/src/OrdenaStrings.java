import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class OrdenaStrings {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<String>();
        palavras.add("alura online");
        palavras.add("caso do código");
        palavras.add("caelum");

        //LAMBDA
//        palavras.sort((s1, s2) -> { // parâmetros são inferidos automaticamente, não precisa colocar String s1, String s2
//                if (s1.length() < s2.length())
//                    return -1;
//                if (s1.length() > s2.length())
//                    return 1;
//                return 0;
//            });

        //MESMO MÉTODO QUE O ACIMA, PORÉM, DE FORMA DIFERENTE:
       // palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

        palavras.sort(Comparator.comparing(s -> s.length())); // mesma coisa que abaixo
        palavras.sort(Comparator.comparing(String::length)); // mesma coisa que acima

        // mesmo método que acima:
        Function<String, Integer> funcao = s -> s.length();
        Comparator<String> comparador = Comparator.comparing(funcao);
        palavras.sort(comparador);

        //---------------------------------------------------------------------------------------------

        System.out.println(palavras); // [caelum, alura online, caso do código]

        Consumer<String> impressor = System.out::println;
        palavras.forEach(impressor);

        //LAMBDA --> equivalente ao código acima. Mais resumido que acima, o qual foi criada uma variável impessor
        palavras.forEach(System.out::println);

    }
}
