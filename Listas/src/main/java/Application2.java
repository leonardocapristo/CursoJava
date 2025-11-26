import java.util.ArrayList;
import java.util.List;

public class Application2 {
    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<>();
        List<Double> lista2 = new ArrayList<>();
        List<String> lista3 = new ArrayList<>();
        List<Boolean> lista4 = new ArrayList<>();


        lista3.add("Leo");
        lista3.add("Bruno");
        lista3.add("Rodrigo");

        System.out.println(lista3);


        lista3.add(1, "Laila");

        System.out.println(lista3);


        for (String nome : lista3){
            System.out.println(nome);
        }

        lista3.removeIf(x -> x.charAt(0) == 'L');


        System.out.println(lista3);



        lista3.indexOf("Rodrigo");

    }
}
