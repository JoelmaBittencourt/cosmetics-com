package org.example.produtos;

public abstract class Produto implements Estoque, Desconto{

    private String nome;
    private String descricao;
    private double preco;
    private String marca;
    private Estoque estoque;


    public Produto(String nome, String descricao, double preco, String marca, int codigo) {
        this.descricao = descricao;
        this.preco = preco;
        this.marca = marca;
        this.estoque = estoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Estoque getEstoque() {
        return estoque;
    }

    public void setEstoque(Estoque estoque) {
        this.estoque = estoque;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                ", marca='" + marca + '\'' +
                ", estoque=" + estoque +
                '}';
    }
}