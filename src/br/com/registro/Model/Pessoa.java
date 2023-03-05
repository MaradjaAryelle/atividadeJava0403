package br.com.registro.Model;

public class Pessoa {
    String nome;
    int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void descrever() {
        System.out.printf("%s mora na casa e tem %d anos", nome, idade);
    }
}