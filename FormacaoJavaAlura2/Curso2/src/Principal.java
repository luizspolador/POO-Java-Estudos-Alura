import br.com.alura.screenmatch.calculator.RecomendationFilter;
import br.com.alura.screenmatch.calculator.TimeCalculator;
import br.com.alura.screenmatch.models.Episodes;
import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Serie;

public class Principal {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.setName("O poderoso chefão");
        myMovie.setReleaseYear(1980);
        myMovie.setDurationMinutes(180);

        myMovie.showTechnicalFileMovie();

        myMovie.evaluate(8);
        myMovie.evaluate(9);
        myMovie.evaluate(5);
        myMovie.evaluate(7);
        System.out.println("sum evaluations: " + myMovie.getSumEvaluation());
        System.out.println("total evaluations: " + myMovie.getTotalEvaluations());

        System.out.println("avarage: " + myMovie.avarageEvaluations());

        Serie serie = new Serie();
        serie.setName("Lost");
        serie.setReleaseYear(2000);
        serie.showTechnicalFileMovie();
        serie.setSeasons(10);
        serie.setEpisodesBySeasons(8);
        serie.setMinutesByEpisode(55);
        System.out.println("Time no complete serie: " + serie.getDurationMinutes());

        TimeCalculator timeCalculator = new TimeCalculator();
        timeCalculator.include(myMovie);
        System.out.println(timeCalculator.getTotalTime());


        RecomendationFilter rf = new RecomendationFilter();
        rf.filter(myMovie);

        Episodes episodes = new Episodes();
        episodes.setNumber(1);
        episodes.setSerie(serie);
        episodes.setTotalViews(300);
        rf.filter(episodes);
    }
}
