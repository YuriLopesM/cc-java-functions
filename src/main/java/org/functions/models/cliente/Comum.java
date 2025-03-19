package org.functions.models.cliente;

public class Comum extends TipoCliente {
    @Override
    public double getDesconto() {
        return 0.05;
    }
}
