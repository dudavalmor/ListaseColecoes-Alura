package Exercicio1;

public class Pessoa {

    private String nome;
    private int idade;

    public Pessoa(int idade, String nome) {
        this.idade = idade;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Pessoa: " + nome + " (idade: " + idade + ")";
    }
}
