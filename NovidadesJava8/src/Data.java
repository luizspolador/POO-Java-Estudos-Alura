import java.time.*;
import java.time.format.DateTimeFormatter;

public class Data {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        LocalDate dataAleatoria = LocalDate.of(2025, Month.JUNE, 5);

        int anos = dataAleatoria.getYear() - hoje.getYear();
        System.out.println(anos);

        Period periodo = Period.between(hoje, dataAleatoria);
        System.out.println(periodo.getDays());

       LocalDate proximaDataAleatoria = dataAleatoria.plusYears(4);
        System.out.println(proximaDataAleatoria);

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String valorFormatado = proximaDataAleatoria.format(formatador);
        System.out.println(valorFormatado);

        // para horas, min e seg
        DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
        LocalDateTime agora = LocalDateTime.now();
        System.out.println(agora.format(formatadorComHoras)); // imprime data e hora atual

        LocalTime intervalo = LocalTime.of(15, 30);
        System.out.println(intervalo); // 15:30

    }
}
