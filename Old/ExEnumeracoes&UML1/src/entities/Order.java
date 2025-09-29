package entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	private LocalDateTime moment;
	private OrderStatus status;
	
	private Client client;
	private List<OrderItem> items = new ArrayList<>();

	public Order() {

	}

	public Order(LocalDateTime moment, OrderStatus status, Client client) {
		super();
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public LocalDateTime getMoment() {
		return moment;
	}

	public void setMoment(LocalDateTime moment) {
		this.moment = moment;
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

	public void addItem(OrderItem item) {
		items.add(item);
	}

	public void removeItem(OrderItem item) {
		items.remove(item);
	}

	public Double total() {
		double sum = 0;
		for (OrderItem item : items) {
			sum = sum + item.subTotal();
		}
		return sum;
	}

	@Override
	public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("Pedido realizado em: ").append(moment).append("\n");
	    sb.append("Status: ").append(status).append("\n");
	    sb.append("Cliente: ").append(client).append("\n");
	    sb.append("Itens do pedido:\n");
	    
	    for (OrderItem item : items) {
	        sb.append(item).append("\n");
	    }

	    sb.append("Total: R$").append(String.format("%.2f", total()));
	    return sb.toString();
	}

	
	

}
