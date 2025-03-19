package org.functions.models;

public class Jogo {
    private int vidaJogador;
    private int vidaInimigo;

    public Jogo(int vidaJogador, int vidaInimigo) {
        this.vidaJogador = vidaJogador;
        this.vidaInimigo = vidaInimigo;
    }

    public void atacarJogador(int dano) {
        vidaJogador -= dano;

        if (vidaJogador > 0) {
            System.out.println("Vida do Jogador: " + vidaJogador);
            return;
        }

        System.out.println("Jogador perdeu!");
    }

    public void atacarInimigo(int dano) {
        vidaInimigo -= dano;

        if (vidaInimigo > 0) {
            System.out.println("Vida do Inimigo: " + vidaInimigo);
            return;
        }

        System.out.println("Inimigo perdeu!");
    }

    public int getVidaJogador() {
        return vidaJogador;
    }

    public int getVidaInimigo() {
        return vidaInimigo;
    }

}
