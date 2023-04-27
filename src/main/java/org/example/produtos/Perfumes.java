package org.example.produtos;

public class Perfumes extends Produto{

    private String marca;
    private String fragrancia;

    public Perfumes(String nome, String descricao, double preco, String marca, int codigo) {
        super(nome, descricao, preco, marca, codigo);
    }

    @Override
    public void calcularImposto() {
    }

    @Override
    public void removerProduto(int quantidade) {

    }

    @Override
    public void exibirStatusEstoque() {

    }

    @Override
    public void aplicarDesconto(double valorDesconto) {

    }

//    @Override
//    public double calcularImposto() {
//        return 0;
//    }
//
//
//    @Override
//    public void removerProduto(int quantidade) {
//
//    }
//
//    @Override
//    public void exibirStatusEstoque() {
//
//    }
}
