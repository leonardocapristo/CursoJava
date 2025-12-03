package services.interfaces.implementation;

import services.interfaces.Calculadora;

public class CasioCalculadora implements Calculadora {

    public CasioCalculadora() {
    }

    @Override
    public double somar(double x, double y) {
        return x+y;
    }

    @Override
    public double subtrair(double x, double y) {
        return x-y;
    }

    @Override
    public double dividir(double x, double y) {
        return x/y;
    }

}
