package Exercício2;

public class ProdutoPerecivel extends Produto{
    String dataValidade;


    public ProdutoPerecivel(String nome, double preco, int quantidade, String dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }

    public static void main(String[] args) {
        ProdutoPerecivel produto1 = new ProdutoPerecivel("Produto 1", 3.99, 2, "12/07/2025");
        System.out.println(produto1);
    }
}
