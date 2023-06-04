package org.example.produtos;

public class Main {
    public static void main(String[] args) {


        var maquiagem01 = new Maquiagem("rimel", "", 0.0, "", 10);
        maquiagem01.removerProduto(10);
        maquiagem01.exibirDetalhesDeProduto();
        maquiagem01.exibirStatusEstoque();

        var maquiagem02 = new Maquiagem("batom", "", 0.0, "", 10);
        maquiagem01.removerProduto(10);
        maquiagem01.exibirDetalhesDeProduto();
        maquiagem01.exibirStatusEstoque();

        var maquiagem03 = new Maquiagem("lápis", "", 0.0, "", 10);
        maquiagem01.removerProduto(10);
        maquiagem01.exibirDetalhesDeProduto();
        maquiagem01.exibirStatusEstoque();


        Maquiagem[] maquiagens = new Maquiagem[2];
        maquiagens[0] = maquiagem01;
        maquiagens[1] = maquiagem02;
        System.out.println(maquiagens.length);
        System.out.println("maquiagem 0 " + maquiagens[0].getNome());
        System.out.println("maquiagem 1 " + maquiagens[1].getNome());

        try {
            maquiagens[2] = maquiagem02;
            System.out.println("maquiagem 2 " + maquiagens[2].getNome());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("posição do vetor não existe");
        } finally {
            assert System.out != null;
            System.out.println("finalização do bloco");
        }

    }
}