import entities.Eletronics;
import entities.Kitchen;
import entities.Product;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        // Lista normal de Product
        List<Product> list = new ArrayList<>();

        // Lista com extends (somente leitura segura)
        List<? extends Product> list2 = new ArrayList<>();

        list.add(new Eletronics("TV", 500.0, "eletronics"));

        System.out.println(list);

        // Exemplos adicionais
        // 1. Lista com super (permite adicionar Product e subclasses)
        List<? super Product> list3 = new ArrayList<>();
        list3.add(new Eletronics("Notebook", 3500.0, "eletronics"));
        list3.add(new Kitchen("Cadeira", 800.0,"kitchen"));

        // Leitura somente como Object
        Object obj = list3.get(0);
        System.out.println(obj);

        // 2. Usando método com extends (somente leitura)
        showProducts(list);

        // 3. Usando método com super (adicionar itens)
        addExample(list3);
    }

        // Método que aceita listas de Product ou qualquer subclasse
    public static void showProducts(List<? extends Product> products) {
        for (Product p : products) {
            System.out.println("Produto: " + p.getName());
        }
    }

    // Método que aceita Product e superclasses, permitindo adicionar
    public static void addExample(List<? super Product> products) {
        products.add(new Eletronics("Teclado Mecânico", 250.0,"eletronics"));
    }
}