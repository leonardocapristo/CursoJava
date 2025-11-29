import entities.Order;
import enums.OrderStatus;


import java.util.Date;

public class Application {
    public static void main(String[] args) {


        Order order = new Order(450, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);


        order.setStatus(OrderStatus.SHIPPED);

        System.out.println(order);
    }
}
