import util.Product;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name;
        double price;
        int quantity,add,remove;

        System.out.println("Entre com os dados do produto : ");
        System.out.println("Nome: ");
        name = sc.nextLine();

        System.out.println("Price : ");
        price = sc.nextDouble();

        System.out.println("quantity : ");
        quantity = sc.nextInt();

        Product product = new Product();

        product.name = name;
        product.price = price;
        product.quantity = quantity;

        System.out.println(product);

        System.out.println("total valor no estoque : " + product.totalValueInStock());


        System.out.println("Quantos produtos deseja adicionar ? : ");
        add = sc.nextInt();
        product.addProducts(add);

        System.out.println(product);
        System.out.println("total valor no estoque : " + product.totalValueInStock());

        System.out.println("Quantos produtos deseja remover ? : ");
        remove = sc.nextInt();
        product.removeProducts(remove);

        System.out.println(product);
        System.out.println("Total valor no estoque : " + product.totalValueInStock());


    }
}
