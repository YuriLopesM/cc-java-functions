package org.functions;

import org.functions.models.*;
import org.functions.models.cliente.Vip;

public class App
{
    public static void main( String[] args )
    {
        System.out.println("-- Exercício 1 -------------------------------");

        Pedido pedido = new Pedido(100.0, new Vip());
        pedido.exibirResumo();


        System.out.println("\n-- Exercício 2 -------------------------------");

        TimeDaPartida timeCasa = new TimeDaPartida("Time A", 2, 55.0, 10, 15, 3, 1);
        TimeDaPartida timeVisitante = new TimeDaPartida("Time B", 1, 45.0, 8, 12, 2, 0);
        Partida partida = new Partida(timeCasa, timeVisitante);

        GerenciadorPartida gerenciador = new GerenciadorPartida();
        gerenciador.registrarPartida(partida);
        gerenciador.gerarRelatorio();

        System.out.println("\n-- Exercício 3 -------------------------------");

        FilmeService filmeService = new FilmeService();

        filmeService.listarFilmesDisponiveis();
        filmeService.listarFilmes();

        filmeService.disponibilizarFilme("Inception");
        filmeService.indisponibilizarFilme("Matrix");

        System.out.println("\n-- Exercício 4 -------------------------------");
        Produto produto1 = new Produto("Laptop", 1500.00);
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras(produto1);

        Produto produto2 = new Produto("Smartphone", 1200.00);
        carrinho.adicionarProdutoAoCarrinho(produto2);

        carrinho.finalizarCompra();
        carrinho.mostrarDetalhes();

        System.out.println("\n-- Exercício 5 -------------------------------");

        Jogo jogo = new Jogo(100, 100);
        jogo.atacarInimigo(50);
        jogo.atacarJogador(25);
        jogo.atacarInimigo(60);
    }
}
