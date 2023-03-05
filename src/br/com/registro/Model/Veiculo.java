package br.com.registro.Model;

public class Veiculo {
    String marca;
    String modelo;
    int ano;
    String cor;
    double velocidadeAtual;

    public Veiculo(String marca, String modelo, int ano, String cor, double velocidadeAtual) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.velocidadeAtual = velocidadeAtual;
    }

    public void acelerar(double velocidade) {
        velocidadeAtual += velocidade;
        System.out.println("O " + this.modelo + " está acelerando a " + velocidadeAtual + " por hora.");
    }

    public void reduzir(double velocidade) {
        velocidadeAtual -= velocidade;
        System.out.println("O " + this.modelo + " está reduzindo para " + velocidadeAtual + " por hora.");
    }

    public void descrever(){
        System.out.printf("O veículo é um %s " +
                "\nDa marca %s " +
                "\nDo ano %d " +
                "\nE é da cor %s\n", modelo, marca, ano, cor);
    }



}