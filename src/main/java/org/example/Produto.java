package org.example;

public class Produto {

    private String nome;
    private String descricao;
    private double preco;
    private  String marca;
    private int estoque;
    private int codigo;


    public void DiminuirEstoque(int venda) {
        this.estoque = this.estoque - venda;
    }

    public double calcularDesconto() {
        return this.preco * 0.1;
    }
    public double calcularImposto() {
        return this.preco * 0.1;
    }
    public double calcularTotal() {
        double desconto = this.preco * 0.1; // Multiplica o preço por 0.1 para calcular 10% de desconto
        return desconto;

    }
    public void detalhesDaAplicacao(){
        System.out.println("Modo de uso do " + this.nome);
    }
}
