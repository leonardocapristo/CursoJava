package entities;

public class Eletronics extends  Product {

    String category;

    public Eletronics(String name, Double price, String category) {
        super(name, price);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Eletronics{" +
                "category='" + category + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
