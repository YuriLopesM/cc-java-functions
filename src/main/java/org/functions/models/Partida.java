package org.functions.models;

public class Partida {
    private TimeDaPartida timeCasa;
    private TimeDaPartida timeVisitante;

    public Partida(TimeDaPartida timeCasa, TimeDaPartida timeVisitante) {
        this.timeCasa = timeCasa;
        this.timeVisitante = timeVisitante;
    }

    public String pegarTimeVencedor() {
        Integer golsCasa = this.timeCasa.getGolsMarcados();
        Integer golsVisitante = this.timeVisitante.getGolsMarcados();
        String nomeTimeCasa = this.timeCasa.getNome();
        String nomeTimeVisitante = this.timeVisitante.getNome();


        String vencedor = golsCasa > golsVisitante ? nomeTimeCasa : (golsCasa < golsVisitante ? nomeTimeVisitante : "Empate");

        return vencedor;
    }

    public Integer pegarTotalChutes() {
        Integer totalChutesCasa = this.timeCasa.getChutes();
        Integer totalChutesVisitante = this.timeVisitante.getChutes();

        Integer total = totalChutesCasa + totalChutesVisitante;

        return total;
    }

    public Integer pegarTotalFaltas() {
        Integer totalFaltasCasa = this.timeCasa.getFaltas();
        Integer totalFaltasVisitante = this.timeVisitante.getFaltas();

        Integer total = totalFaltasCasa + totalFaltasVisitante;

        return total;
    }

    public Integer pegarTotalCartoes() {
        Integer cartoesAmarelosCasa = this.timeCasa.getCartoesAmarelos();
        Integer cartoesVermelhosCasa = this.timeCasa.getCartoesVermelhos();
        Integer cartoesAmarelosVisitante = this.timeCasa.getCartoesAmarelos();
        Integer cartoesVermelhosVisitante = this.timeCasa.getCartoesVermelhos();

        Integer total = cartoesAmarelosCasa + cartoesVermelhosCasa + cartoesAmarelosVisitante + cartoesVermelhosVisitante;

        return total;
    }

    public TimeDaPartida getTimeCasa() {
        return timeCasa;
    }

    public TimeDaPartida getTimeVisitante() {
        return timeVisitante;
    }
}
