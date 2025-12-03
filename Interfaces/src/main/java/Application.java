import entities.CarRental;
import entities.Vehicle;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");

        System.out.println("Entre com os dados do aluguel : ");
        System.out.println("Modelo do carro : ");
        String model = sc.nextLine();
        Vehicle vehicle = new Vehicle(model);

        System.out.println("Retirada (dd/MM/yyyy hh:mm) : ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(),fmt);
        System.out.println("Retorno (dd/MM/yyyy hh:mm) : ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(),fmt);


        CarRental carRental = new CarRental(start,finish,vehicle);





        sc.close();
    }
}
