
import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        // lista NÃO aceita tipos primitivos

        List<String> list = new ArrayList<>();

        list.add("Leo");
        list.add("Bruno");
        list.add("Rodrigo");

        System.out.println(list);

        list.remove(1);
        list.remove("Rodrigo");

        System.out.println(list);


        System.out.println(list.size());
        






    }
}
