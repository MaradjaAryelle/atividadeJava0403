package br.com.registro.Model;

public class Casa {
    Animal[] listaDeAnimais = new Animal[4];
    Veiculo[] listaDeVeiculos = new Veiculo[5];
    Pessoa[] listaDePessoas = new Pessoa[2];

    public Casa(Animal[] listaDeAnimais, Veiculo[] listaDeVeiculos, Pessoa[] listaDePessoas) {
        this.listaDeAnimais = listaDeAnimais;
        this.listaDeVeiculos = listaDeVeiculos;
        this.listaDePessoas = listaDePessoas;
    }

    public void listarAnimais() {
        System.out.println("Lista de animais:");
        for (int i = 0; i < listaDeAnimais.length; i++) {
            listaDeAnimais[i].descrever();
            System.out.println();
        }
    }

    public void listarVeiculos() {
        System.out.println("Lista de Veiculos:");
        for (int i = 0; i < listaDeVeiculos.length; i++) {
            listaDeVeiculos[i].descrever();
            System.out.println();
        }
    }
    public void listarPessoas() {
        System.out.println("Lista de Pessoas:");
        for (int i = 0; i < listaDePessoas.length; i++) {
            listaDePessoas[i].descrever();
            System.out.println();
        }
    }


}
