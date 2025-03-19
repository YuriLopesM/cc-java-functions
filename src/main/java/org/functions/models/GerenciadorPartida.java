package org.functions.models;

public class GerenciadorPartida {
    private Partida partida;

    public void registrarPartida(Partida partida) {
        this.partida = partida;

        TimeDaPartida timeCasa = partida.getTimeCasa();
        TimeDaPartida timeVisitante = partida.getTimeVisitante();

        System.out.println("============ Partida Registrada! ============");
        System.out.println(timeCasa.getNome() + " " + timeCasa.getGolsMarcados() + " x " + timeVisitante.getGolsMarcados() + " " + timeVisitante.getNome());
        System.out.println("Posse de Bola: " + timeCasa.getPosseBola() + "% - " + timeVisitante.getPosseBola() + "%");
        System.out.println("Chutes: " + timeCasa.getChutes() + " - " + timeVisitante.getChutes());
        System.out.println("Faltas: " + timeCasa.getFaltas() + " - " + timeVisitante.getFaltas());
        System.out.println("Cartões Amarelos: " + timeCasa.getCartoesAmarelos() + " - " + timeVisitante.getCartoesAmarelos());
        System.out.println("Cartões Vermelhos: " + timeCasa.getCartoesVermelhos() + " - " + timeVisitante.getCartoesVermelhos());
    }

    public void gerarRelatorio() {
        String vencedor = this.partida.pegarTimeVencedor();

        TimeDaPartida timeCasa = this.partida.getTimeCasa();
        TimeDaPartida timeVisitante = this.partida.getTimeVisitante();

        Integer totalChutes = this.partida.pegarTotalChutes();
        Integer totalCartoes = this.partida.pegarTotalCartoes();
        Integer totalFaltas = this.partida.pegarTotalFaltas();

        System.out.println("\n =========== Relatório da Partida ============");
        System.out.println("Vencedor: " + vencedor);
        System.out.println("Posse de Bola: " + timeCasa.getPosseBola() + "% - " + timeVisitante.getPosseBola() + "%");
        System.out.println("Total de Chutes: " + totalChutes);
        System.out.println("Total de Faltas: " + totalFaltas);
        System.out.println("Total de Cartões: " + totalCartoes);
    }
}
