package br.com.alura.screenmatch.calculator;

import br.com.alura.screenmatch.models.Title;

public class TimeCalculator {
    private int totalTime;

    public int getTotalTime() {
        return totalTime;
    }


    public void include(Title title){
        System.out.println("adicionando duração em minutos de " + title);
        this.totalTime += title.getDurationMinutes();
    }
}
