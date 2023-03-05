package br.com.registro.Main;

import br.com.registro.Model.Animal;
import br.com.registro.Model.Casa;
import br.com.registro.Model.Pessoa;
import br.com.registro.Model.Veiculo;

public class Main {
    public static void main(String[] args) {
        Veiculo carro1 = new Veiculo("Volkswagen", "Brasilia", 1982, "Amarela", 40);
        Veiculo carro2 = new Veiculo("Chevrolet", "Impala", 1967, "preto", 70);
        Veiculo carro3 = new Veiculo("Fiat", "Uno", 2020, "vermelho", 100);
        Veiculo carro4 = new Veiculo("Volkswagen", "Fusca", 1970, "Branca", 60);
        Veiculo carro5 = new Veiculo("Renault", "Kwid", 2023, "azul", 80);

        Veiculo[] listaDeVeiculos = new Veiculo[5];

//        carro1.acelerar(10);
//        carro2.reduzir(20);
//        carro3.acelerar(5);
//        carro4.reduzir(12);
//        carro5.acelerar(16);

        listaDeVeiculos[0] = carro1;
        listaDeVeiculos[1] = carro2;
        listaDeVeiculos[2] = carro3;
        listaDeVeiculos[3] = carro4;
        listaDeVeiculos[4] = carro5;

        Animal animal1 = new Animal("Sushi", "Vira-lata", 3, "Rajada");
        Animal animal2 = new Animal("Temaki", "Vira-lata", 0, "Caranelo");
        Animal animal3 = new Animal("Preta", "Vira-lata", 4, "Rajada");
        Animal animal4 = new Animal("Nevaska", "Vira-lata", 4, "Branca");

        Animal[] listaDeAnimais = new Animal[4];

//        animal1.descrever();
//        animal2.vender(100);

        listaDeAnimais[0] = animal1;
        listaDeAnimais[1] = animal2;
        listaDeAnimais[2] = animal3;
        listaDeAnimais[3] = animal4;

        Pessoa pessoa1 = new Pessoa("Aryelle", 30);
        Pessoa pessoa2 = new Pessoa("Jefferson", 30);

        Pessoa[] listaDePessoas = new Pessoa[2];

        Casa casa1 = new Casa(listaDeAnimais, listaDeVeiculos, listaDePessoas);
        casa1.listarAnimais();
        casa1.listarVeiculos();
        casa1.listarPessoas();

    }
}