import entites.Pessoa;
import entites.PessoaCLT;

public class Application {
    public static void main(String[] args) {


        Pessoa pessoa = new PessoaCLT("leo", 24, 1000.0);

        System.out.println(((PessoaCLT) pessoa).mostrarDados());
    }
}
