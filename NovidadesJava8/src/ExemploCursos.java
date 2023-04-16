import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class Curso {
    private String nome;
    private int alunos;

    public Curso(String nome, int alunos) {
        this.nome = nome;
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public int getAlunos() {
        return alunos;
    }
}

public class ExemploCursos {
    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<Curso>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 55));

        //lambda - ordenação pela quantidade de alunos:
        cursos.sort(Comparator.comparing(c -> c.getAlunos()));


        cursos.stream().filter(c -> c.getAlunos() >= 100).forEach(c -> System.out.println(c.getNome())); // seleciona os cursos com mais de 100 alunos

        cursos.stream().filter(c -> c.getAlunos() >= 100).map(c -> c.getAlunos()).forEach(total -> System.out.println(total)); // mostra o número de alunos dos cursos com mais de 100 alunos

        int sum = cursos.stream().filter(c -> c.getAlunos() >= 100).mapToInt(Curso::getAlunos).sum(); // soma o número de aluno o qual os cursos possuem 100 ou mais alunos
        System.out.println(sum); //263

        cursos.forEach(c -> System.out.println(c.getNome())); // imprime o nome de todos os cursos

        cursos.stream().filter(c -> c.getAlunos() >= 100). findAny().ifPresent((c -> System.out.println(c.getNome()))); // se existir o curso com mais de 100 alunos, imprima qualquer curso com mais de 100 alunos

        System.out.println("Média de todos os cursos: " + cursos.stream()
                .mapToInt(c -> c.getAlunos())
                .average());
    }
}
