package org.functions.models;

public class CarrinhoDeCompras {
    private Produto produto;

    public CarrinhoDeCompras(Produto produto) {
        this.produto = produto;
    }

    public void adicionarProdutoAoCarrinho(Produto novoProduto) {
        this.produto = novoProduto;
    }

    public void finalizarCompra() {
        produto = produto.aplicarDesconto(10.0);
    }

    public void mostrarDetalhes() {
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getPreco());
    }
}
