import entities.Animal;
import entities.racas.Gato;

import java.sql.SQLOutput;

public class Application {
    public static void main(String[] args) {




        // UP CASTING (acessar metodos da classe pai animal)  
        Animal gatoAnimal = new Gato("nikiba","vira lata");


        System.out.println(gatoAnimal.acao());
        System.out.println(gatoAnimal);



        // DOWNCASTING (acessar metodos especificos do gato)
        Gato gato = (Gato) gatoAnimal;

        System.out.println(gato.miar());
        System.out.println(gato);


        //UP CASTING DE NOVO

        Animal gatoAnimal2 = gato;

        System.out.println(gatoAnimal2);







    }
}
