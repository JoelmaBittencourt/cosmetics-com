package org.example.produtos;

public class Maquiagem extends Produto {

    private String tipoDeProduto;
    private String cor;

    public Maquiagem(String nome, String descricao, double preco, String marca, int codigo) {
        super(nome, descricao, preco, marca, codigo);
    }


    public void exibirDetalhesDeProduto() {
        System.out.println("Tipo:" + this.tipoDeProduto);
        System.out.println("Marca:" + this.cor);
        super.toString();


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
}