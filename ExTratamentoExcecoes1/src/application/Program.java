package application;

// Importação das classes Pessoa e IdadeInsuficienteException
import model.entities.Pessoa;
import model.exceptions.IdadeInsuficienteException;

public class Program {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Leonardo", 16); // Altere a idade para testar

        try {
            pessoa.verificarCNH();
        } catch (IdadeInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        }


        System.out.println("Processo finalizado.");
    }
}
