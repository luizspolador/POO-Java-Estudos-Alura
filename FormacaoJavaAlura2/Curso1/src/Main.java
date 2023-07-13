public class Main {
    public static void main(String[] args) {

        //TEXT BLOCK
        String sinopse;
        int anoDeLancamento = 2022;

        sinopse = """   
                Filme Top Gun
                Filme de ação
                Nunca assisti
                Ano de lançamento
                """ + anoDeLancamento;
        System.out.println(sinopse);
//        Filme Top Gun
//        Filme de ação
//        Nunca assisti
//        Ano de lançamento
//        2022


        //comparando strings
        String senha = "1234";
        if (senha.equals("1234")){
            System.out.println("Autorizado");
        } else {
            System.out.println("Não autorizado");
        }

        //FORMATANDO TEXTOS
        String nome = "Maria";
        int idade = 30;
        double valor = 600.0;
        System.out.println(String.format("Meu nome é %s, eu tenho %d anos e hoje ganhei %.2f reais em aposta", nome, idade, valor));
        // Meu nome é Maria, eu tenho 30 anos e hoje ganhei 600.00 reais em aposta


        String aluno = "João";
        int aulas = 4;

        String mensagem = """
                  Olá, %s!
                  Boas vindas ao curso de Java.
                  Teremos %d aulas para te mostrar o que é preciso para você dar o seu primeiro mergulho na linguagem!
                  """.formatted(aluno, aulas);
        System.out.println(mensagem);

//        Olá, João!
//        Boas vindas ao curso de Java.
//        Teremos 4 aulas para te mostrar o que é preciso para você dar o seu primeiro mergulho na linguagem!


        //CASTING
        double nota1 = 5;
        double nota2 = 3;
        int classificacao = (int) ((nota1 + nota2) / 2);
        System.out.println(classificacao);
    }
}