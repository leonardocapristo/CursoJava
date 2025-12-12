package entities;

public class Kitchen extends  Product {

    String category;

    public Kitchen(String name, Double price, String category) {
        super(name, price);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
