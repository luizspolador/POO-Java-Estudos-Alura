package br.com.alura.principal;

import br.com.alura.dominio.MinhasPreferidas;
import br.com.alura.dominio.Musica;
import br.com.alura.dominio.Podcast;

public class Principal {
    public static void main(String[] args) {

        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Forever");
        minhaMusica.setCantor("Kiss");

        for (int i = 0; i < 5000; i++) {
            minhaMusica.reproduzir();
        }

        for (int i = 0; i < 1000; i++) {
            minhaMusica.curte();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Dev");
        meuPodcast.setApresentador("Luiz");

        for (int i = 0; i < 400; i++) {
            meuPodcast.reproduzir();
        }

        for (int i = 0; i < 3; i++) {
            meuPodcast.curte();
        }

        MinhasPreferidas minhasPreferidas = new MinhasPreferidas();
        minhasPreferidas.inclui(meuPodcast);
        minhasPreferidas.inclui(minhaMusica);

    }

}
