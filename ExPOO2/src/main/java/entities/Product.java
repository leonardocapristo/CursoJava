package entities;

public class Product {
    public String name;
    public double price;
    public int quantity;



    public double totalValueInStock(){

        double totalValueInStock = this.quantity * this.price;

        return totalValueInStock;
    }

    public void addProducts (int quantity){

        this.quantity += quantity;
    }

    public void removeProducts (int quantity){

        this.quantity -= quantity;
    }


    @Override
    public String toString() {
        return "Name : " + name + ", "
                + "Price : " + price + ",  "
                + "Quantity : " + quantity;
    }
}
