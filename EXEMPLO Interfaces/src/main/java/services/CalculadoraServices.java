package services;

import services.interfaces.Calculadora;
import services.interfaces.implementation.CasioCalculadora;

public class CalculadoraServices {

    Calculadora calculadora = new CasioCalculadora();

    public CalculadoraServices() {
    }


    //assim da pra criar a interface com outra implentação no progroma main, ao contrario irá sempre usar
    // a casio calculadora que instanciamos em cima
    /*
    public CalculadoraServices(Calculadora calculadora) {
        this.calculadora = calculadora;
    }
    */

    public double somar(double x, double y){
        return calculadora.somar(x,y);
    }

}
