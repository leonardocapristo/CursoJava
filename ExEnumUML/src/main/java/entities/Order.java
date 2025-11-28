package entities;

import enums.OrderStatus;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order {

    private LocalDateTime date;
    private OrderStatus status;


    private Client client;
    private List<OrderItem> items = new ArrayList<>();

    public Order() {

    }

    public Order(LocalDateTime date, OrderStatus status, Client client, List<OrderItem> items) {
        this.date = date;
        this.status = status;
        this.client = client;
        this.items = items;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItem> getItems() {
        return items;
    }


    public void addItem(OrderItem item){
        items.add(item);
    }

    public void removeItem(OrderItem item){
        items.remove(item);
    }

    public double total(){

        double total = 0;
        for (OrderItem item : items){
            total += item.subTotal();
        }

        return total;
    }

    @Override
    public String toString() {
        return "Order{" +
                "date=" + date +
                ", status=" + status +
                ", client=" + client +
                ", items=" + items +
                '}';
    }
}
