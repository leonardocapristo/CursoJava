import entities.Employees;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("how many employees will be registred ? ");
        int n = sc.nextInt();


        List<Employees> lista = new ArrayList<>();


        for (int i = 0; i < n; i++) {

            System.out.println("ID : ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.println("Name : ");
            String name = sc.nextLine();
            System.out.println("Salary : ");
            double salary = sc.nextDouble();

            Employees employee = new Employees(id,salary,name);

            lista.add(employee);

        }

        System.out.println(lista);


        System.out.println("Enter the employee ID that will have increasy salary : ");

        int id = sc.nextInt();

        for (Employees employee : lista){
            if (employee.getId() == id){

                System.out.println("Digite a porcentagem de aumento para o funcionário de ID : " + employee.getId());
                double percent = sc.nextDouble();
                employee.increaseSalary(percent);

                System.out.println(employee);
            }
        }


        System.out.println(lista);



    }
}
