package org.example.produtos;

public class Maquiagem extends Produto{

    private String tipoDeProduto; // Atributo específico de Maquiagem
    private String cor; // Atributo específico de Maquiagem

    public Maquiagem(String nome, String descricao, double preco, String marca, Estoque estoque, int codigo) {
        super(nome, descricao, preco, marca, estoque, codigo);
    }

    @Override
    public double calcularImposto() {
        return 0;
    }

    @Override
    public void exibirDetalhesDeProduto() {
        System.out.println("Tipo:" + this.tipoDeProduto);
        System.out.println("Marca:" + this.cor);
        super.exibirDetalhesDeProduto();

    }

    @Override
    public void removerProduto(int quantidade) {

    }

    @Override
    public void exibirStatusEstoque() {

    }
}
