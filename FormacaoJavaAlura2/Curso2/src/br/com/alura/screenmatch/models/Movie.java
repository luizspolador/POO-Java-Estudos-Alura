package br.com.alura.screenmatch.models;

import br.com.alura.screenmatch.calculator.Reviews;

public class Movie extends Title implements Reviews {
    private String sirector;

    public String getSirector() {
        return sirector;
    }

    public void setSirector(String sirector) {
        this.sirector = sirector;
    }

    @Override
    public int getReview() {
        return (int) avarageEvaluations() / 2;
    }
}
