import entities.Pessoa;

public class Application {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("leo", 24);
        Pessoa pessoa2 = new Pessoa("leo", 24);
        Pessoa pessoa3 = new Pessoa("bruno", 25);

        System.out.println(pessoa1.equals(pessoa2));
        System.out.println(pessoa1.equals(pessoa3));
        System.out.println(pessoa1.hashCode());
        System.out.println(pessoa2.hashCode());
        System.out.println(pessoa3.hashCode());
    }
}
