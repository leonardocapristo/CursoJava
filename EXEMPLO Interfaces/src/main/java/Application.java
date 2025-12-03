import services.CalculadoraServices;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {


        CalculadoraServices calculadoraServices = new CalculadoraServices();
        Scanner sc = new Scanner(System.in);

        double x,y;

        System.out.println("Digite o primeiro valor : ");
        x = sc.nextDouble();

        System.out.println("Digite o segundo valor : ");
        y = sc.nextDouble();

        System.out.println(calculadoraServices.somar(x,y));


        sc.close();
    }
}
