package br.com.alura.screenmatch.models;

public class Title {
    private String name;
    private int releaseYear;
    private boolean planIncluded;
    private double sumEvaluation;
    private int totalEvaluations;
    private int durationMinutes;

    // methods
    public void showTechnicalFileMovie(){
        System.out.println("br.com.alura.screenmatch.models.Movie name: " + name);
        System.out.println("Release year: " + releaseYear);
    }

    public void evaluate(double grade){
        sumEvaluation += grade;
        totalEvaluations++;
    }

    public double avarageEvaluations (){
        return sumEvaluation / totalEvaluations;
    }

    //getters
    public String getName() {
        return name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public boolean isPlanIncluded() {
        return planIncluded;
    }

    public double getSumEvaluation() {
        return sumEvaluation;
    }

    public int getTotalEvaluations() {
        return totalEvaluations;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setDurationMinutes(int durationMinutes) {
        this.durationMinutes = durationMinutes;
    }
}
