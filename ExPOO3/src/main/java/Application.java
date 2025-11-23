

import util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);


        Scanner sc = new Scanner(System.in);

        double dollar, quantity;



        System.out.println("Qual o valor do dólar?");
        dollar = sc.nextDouble();

        System.out.println("Quantos dólares serão comprados?");
        quantity = sc.nextDouble();;

        System.out.println("Valor a ser pago em reais = " + CurrencyConverter.calculaDolar(quantity,dollar));
    }
}
