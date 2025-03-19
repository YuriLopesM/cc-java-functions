package org.functions.models;

public class FilmeService {
    public void listarFilmes() {
        System.out.println("Listando todos os filmes do catálogo...");
    }

    public void listarFilmesDisponiveis() {
        System.out.println("Listando apenas filmes disponíveis para locação...");
    }

    public void disponibilizarFilme(String titulo) {
        System.out.println("O filme \"" + titulo + "\" agora está disponível para locação.");
    }

    public void indisponibilizarFilme(String titulo) {
        System.out.println("O filme \"" + titulo + "\" foi marcado como indisponível.");
    }

}
