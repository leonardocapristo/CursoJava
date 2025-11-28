import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import enums.OrderStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter client data : ");
        System.out.println("Name : ");
        String name = sc.nextLine();

        System.out.println("Email : ");
        String email = sc.nextLine();

        System.out.println("Birth date : ");
        String date = sc.nextLine();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate birthDate = LocalDate.parse(date, dateTimeFormatter);

        Client client = new Client(name,email,birthDate);

        System.out.println("Enter order data : ");
        
        System.out.println("Status : ");
        OrderStatus status = OrderStatus.valueOf(sc.nextLine());

        System.out.println("How many items to this order ? ");
        int n = sc.nextInt();
        sc.nextLine();

        LocalDateTime dateOrder = LocalDateTime.now();

        Order order = new Order();

        for (int i = 1; i <= n; i++) {


            System.out.println("Enter #" + i + " item data : ");

            System.out.println("Product name : ");
            String productName = sc.nextLine();

            System.out.println("Product price : ");
            double price = sc.nextDouble();

            System.out.println("Quantity : ");
            int quantity = sc.nextInt();
            sc.nextLine();

            OrderItem orderItem = new OrderItem(quantity, price, new Product(productName,price));

            order.addItem(orderItem);


        }

        order.setClient(client);
        order.setDate(dateOrder);
        order.setStatus(status);



        System.out.println("Order summary : ");

        System.out.println("Order moment : " + order.getDate());
        System.out.println("Order status : " + order.getStatus());
        System.out.println("Order client : " + order.getClient());

        System.out.println("Order items : ");

        for (OrderItem item : order.getItems()){
            System.out.println("Product : " + item.getProduct());
            System.out.println("Quantity : " + item.getQuantity());
            System.out.println("Subtotal : " + item.subTotal());

        }


        System.out.println("Total : " + order.total());
















        sc.close();
    }
}
