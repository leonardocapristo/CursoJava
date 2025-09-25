package model.entities;

import model.exceptions.IdadeInsuficienteException; // Importando a exceção

public class Pessoa {
    private String nome;
    private int idade;

    // Construtor
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Método para verificar se pode tirar a CNH
    public void verificarCNH() throws IdadeInsuficienteException {
        if (idade < 18) {
            throw new IdadeInsuficienteException();
        }
        System.out.println(nome + ", você pode tirar sua CNH!");
    }

    // Métodos getters
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}
