package Exercício2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Produto> listaProdutos = new ArrayList<>();

        Produto produto1 = new Produto("Carregador", 50.0, 2);
        Produto produto2 = new Produto("Tomada", 15.99, 5);
        Produto produto3 = new Produto("Fone de ouvido", 79.90, 1);
        Produto produto4 = new Produto("Caderno", 13.99, 3);

        listaProdutos.add(produto1);
        listaProdutos.add(produto2);
        listaProdutos.add(produto3);
        listaProdutos.add(produto4);

        System.out.println("Tamanho da lista: " + listaProdutos.size());
        System.out.println("Um produto da lista é: " + listaProdutos.get(1));
    }
}
