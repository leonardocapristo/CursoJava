package entities;

public class Company extends TaxPayer{

    protected Integer numberOfEmployers;

    public Company() {
    }

    public Company(String name, Double anualIncome, Integer numberOfEmployers) {
        super(name, anualIncome);
        this.numberOfEmployers = numberOfEmployers;
    }

    public Integer getNumberOfEmployers() {
        return numberOfEmployers;
    }

    public void setNumberOfEmployers(Integer numberOfEmployers) {
        this.numberOfEmployers = numberOfEmployers;
    }

    @Override
    public double tax() {

        double imposto = 0.16;

        if (this.numberOfEmployers > 10){
            imposto = 0.14;
        }

        double tax = this.anualIncome * imposto;

        return tax;
    }
}
