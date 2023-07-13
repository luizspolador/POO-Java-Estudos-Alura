package br.com.alura.screenmatch.calculator;

public class RecomendationFilter {
    private String recomendation;

    public void filter(Reviews reviews){
        if (reviews.getReview() >= 4){
            System.out.println("It's between the best ones");
        } else if (reviews.getReview() >= 2){
            System.out.println("good review");
        } else {
            System.out.println("put in your list to watch later");
        }
    }
}
