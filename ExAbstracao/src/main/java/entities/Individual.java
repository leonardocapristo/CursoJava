package entities;

public class Individual extends TaxPayer {

    protected Double healthExpeditures;


    public Individual() {
    }

    public Individual(String name, Double anualIncome, Double healthExpeditures) {
        super(name, anualIncome);
        this.healthExpeditures = healthExpeditures;
    }

    public Double getHealthExpeditures() {
        return healthExpeditures;
    }

    public void setHealthExpeditures(Double healthExpeditures) {
        this.healthExpeditures = healthExpeditures;
    }

    @Override
    public double tax() {

        double imposto = 0.0;
        double custosSaude = 0.0;

        if (this.anualIncome > 20000){
            imposto = 0.15;

        }else {
            imposto = 0.25;
        }

        if (healthExpeditures > 0){

            custosSaude = this.healthExpeditures / 2;

        }

        double tax =  (anualIncome * 0.25) - custosSaude;

        return tax;
    }
}
