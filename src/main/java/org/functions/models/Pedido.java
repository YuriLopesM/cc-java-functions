package org.functions.models;

import org.functions.models.cliente.*;

public class Pedido {
    private double valorTotal;
    private TipoCliente tipoCliente;

    public Pedido(double valorTotal, TipoCliente tipoCliente) {
        this.valorTotal = valorTotal;
        this.tipoCliente = tipoCliente;
    }

    public double calcularDesconto() {
        double desconto = tipoCliente.getDesconto();
        return valorTotal * (1 - desconto);
    }

    public void exibirResumo() {
        System.out.println("Valor Original: R$" + valorTotal);
        System.out.println("Desconto aplicado: " + (tipoCliente.getDesconto() * 100) + "%");
        System.out.println("Valor com Desconto: R$" + calcularDesconto());
    }

    public static void main(String[] args) {
        Pedido pedido1 = new Pedido(100.0, new Vip());
        pedido1.exibirResumo();
    }

}
