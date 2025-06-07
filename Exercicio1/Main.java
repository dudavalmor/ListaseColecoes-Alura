package Exercicio1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

        Pessoa pessoa1 = new Pessoa(20, "Eduarda");
        Pessoa pessoa2 = new Pessoa(25, "Bruna");
        Pessoa pessoa3 = new Pessoa(22, "Julia");

        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);

        System.out.println("Tamanho da lista: " + listaDePessoas.size());

        System.out.println("Primeira pessoa: " + listaDePessoas.get(0));

    }
}
