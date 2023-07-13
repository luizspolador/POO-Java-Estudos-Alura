public class desafio1 {
    public static void main(String[] args) {
        double celsius = 40;
        double fahrenheit = 50;

        double resultadoEmFahrenheit  = (celsius * 1.8) + 32;
        System.out.println("a temperatura de " + celsius + "ºC em Fahrenheit é " + resultadoEmFahrenheit + "F");

        double resultadoEmCelcius = (fahrenheit - 32) * 0.56;
        System.out.println("a temperatura de " + fahrenheit + "F em Celsius é " + resultadoEmCelcius + "ºC");
        System.out.println(String.format("A temperatura de %.2f F em Celsius é de %.2fºC", fahrenheit, resultadoEmFahrenheit));


    }
}
