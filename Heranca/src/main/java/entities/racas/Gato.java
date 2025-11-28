package entities.racas;

import entities.Animal;

public class Gato extends Animal {

    private String raca;

    public Gato(String nome, String raca) {
        super(nome);
        this.raca = raca;
    }

    public String miar (){
       return "Miaaaaaaaau";
    }
}
