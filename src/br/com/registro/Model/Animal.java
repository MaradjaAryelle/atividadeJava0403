package br.com.registro.Model;

import java.awt.*;

public class Animal {
    String nome;
    String raca;
    int idade;
    String cor;

    public Animal( String nome, String raca, int idade, String cor){
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.cor = cor;
    }

    public void descrever(){
        System.out.printf("O nome do animal é %s" +
                "\nEle é um %s" +
                "\nTem %d anos" +
                "\nE é da cor %s\n", nome, raca, idade, cor);
    }

    public void vender(int valor){
        System.out.printf("%s está a venda por " + valor);
    }
}
