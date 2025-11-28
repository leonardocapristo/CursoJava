package entities;

public class Animal {

    private String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public Animal() {
    }

    public String acao(){
        return "todo animal faz isso";
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
