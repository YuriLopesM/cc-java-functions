package org.functions.models;

public class TimeDaPartida {
    private String nome;
    private Integer golsMarcados;
    private Double posseBola;
    private Integer chutes;
    private Integer faltas;
    private Integer cartoesAmarelos;
    private Integer cartoesVermelhos;

    public TimeDaPartida(String nome, Integer golsMarcados, Double posseBola, Integer chutes, Integer faltas, Integer cartoesAmarelos, Integer cartoesVermelhos) {
        this.nome = nome;
        this.golsMarcados = golsMarcados;
        this.posseBola = posseBola;
        this.chutes = chutes;
        this.faltas = faltas;
        this.cartoesAmarelos = cartoesAmarelos;
        this.cartoesVermelhos = cartoesVermelhos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getGolsMarcados() {
        return golsMarcados;
    }

    public void setGolsMarcados(Integer golsMarcados) {
        this.golsMarcados = golsMarcados;
    }

    public Double getPosseBola() {
        return posseBola;
    }

    public void setPosseBola(Double posseBola) {
        this.posseBola = posseBola;
    }

    public Integer getChutes() {
        return chutes;
    }

    public void setChutes(Integer chutes) {
        this.chutes = chutes;
    }

    public Integer getFaltas() {
        return faltas;
    }

    public void setFaltas(Integer faltas) {
        this.faltas = faltas;
    }

    public Integer getCartoesAmarelos() {
        return cartoesAmarelos;
    }

    public void setCartoesAmarelos(Integer cartoesAmarelos) {
        this.cartoesAmarelos = cartoesAmarelos;
    }

    public Integer getCartoesVermelhos() {
        return cartoesVermelhos;
    }

    public void setCartoesVermelhos(Integer cartoesVermelhos) {
        this.cartoesVermelhos = cartoesVermelhos;
    }
}