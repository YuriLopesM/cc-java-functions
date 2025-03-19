package org.functions.models.cliente;

public class Vip extends TipoCliente {
    @Override
    public double getDesconto() {
        return 0.10;
    }
}
