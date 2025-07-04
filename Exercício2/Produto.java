package Exercício2;

public class Produto {

    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Produto: " + nome + "/ R$ " + preco + " por unidade" + "/ quantidade no carrinho: " + quantidade;
    }

    public static void main(String[] args) {
        Produto produto = new Produto("Caneta", 2.99, 2);
        System.out.println(produto);
    }

}
