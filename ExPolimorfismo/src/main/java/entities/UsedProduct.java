package entities;

import java.time.LocalDate;

public class UsedProduct extends Product{

    protected LocalDate manafactureDate;

    public UsedProduct() {

    }

    public UsedProduct(String name, Double price, LocalDate manafactureDate) {
        super(name, price);
        this.manafactureDate = manafactureDate;
    }

    public LocalDate getManafactureDate() {
        return manafactureDate;
    }

    public void setManafactureDate(LocalDate manafactureDate) {
        this.manafactureDate = manafactureDate;
    }

    @Override
    public String priceTag(){
        return "Name : " + name + " ,Price $" + price + ", Manafacture Date : " + manafactureDate;
    }
}
