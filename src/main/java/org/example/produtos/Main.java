package org.example.produtos;

public class Main {
    public static void main(String[] args) {

        var maquiagem = new Maquiagem("", "", 0.0, "", 10);
        maquiagem.removerProduto(10);
        maquiagem.calcularImposto();
        maquiagem.exibirDetalhesDeProduto();
        maquiagem.exibirStatusEstoque();


        var perfume = new Perfumes("", "", 0.0, "", 10);




    }
}