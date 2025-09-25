package application;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Digite os dados do cliente");
        System.out.print("Nome: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Data de nascimento (dd/MM/yyyy): ");
        String birthDateInput = sc.nextLine();
        LocalDate birthDate = LocalDate.parse(birthDateInput, formatter);

        Client client = new Client(name, email, birthDate);
        System.out.println(client);

        System.out.print("Digite quantos produtos quer adicionar ao seu pedido: ");
        int n = sc.nextInt();
        sc.nextLine(); // Limpa o buffer após nextInt()

        LocalDateTime moment = LocalDateTime.now();
        Order order = new Order(moment, OrderStatus.PROCESSING, client);

        for (int i = 1; i <= n; i++) {
            System.out.println("Digite o nome do produto "+ i +" : " );
            String nameProduct = sc.nextLine();
            System.out.println("Digite o preço do produto " + i +" : " );
            double priceProduct = sc.nextDouble();
            System.out.println("Digite a quantidade do produto " + i +" : " );
            int quantity = sc.nextInt();
            sc.nextLine(); // Limpa o buffer após nextInt()

            Product product = new Product(nameProduct, priceProduct);
            OrderItem orderItem = new OrderItem(quantity, product.getPrice(), product);
            order.addItem(orderItem);
        }

        System.out.println(order);
        sc.close();
    }
}
