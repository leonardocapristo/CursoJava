import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Application {
    public static void main(String[] args) {


        Map<String,Integer> map = new HashMap<>();


        map.put("Idade",24);
        map.put("Altura",170);
        map.put("Telefone",1193701340);


        System.out.println(map);
        System.out.println(map.get("Idade"));
        System.out.println(map.get("Altura"));
        System.out.println(map.get("Telefone"));


        map.remove("Telefone");
        System.out.println(map);


        System.out.println(map.keySet());







    }
}
