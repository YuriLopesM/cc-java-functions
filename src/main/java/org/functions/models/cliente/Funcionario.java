package org.functions.models.cliente;

public class Funcionario extends TipoCliente {
    @Override
    public double getDesconto() {
        return 0.20;
    }
}
