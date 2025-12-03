package services;

import services.interfaces.Calculadora;
import services.interfaces.implementation.CasioCalculadora;

public class CalculadoraServices {

    Calculadora calculadora = new CasioCalculadora();

    public CalculadoraServices() {
    }

    public CalculadoraServices(Calculadora calculadora) {
        this.calculadora = calculadora;
    }

    public double somar(double x, double y){
        return calculadora.somar(x,y);
    }

}
