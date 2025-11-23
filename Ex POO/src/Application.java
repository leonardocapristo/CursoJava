import util.Employee;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Nome : ");
        String nome = sc.nextLine();

        System.out.println("Salário bruto : ");
        double salarioBruto = sc.nextDouble();

        System.out.println("Imposto : ");
        double imposto = sc.nextDouble();

        Employee employee = new Employee();

        employee.name = nome;
        employee.grossSalary = salarioBruto;
        employee.tax = imposto;
        double salarioLiquido = employee.netSalary();

        System.out.println(employee.name+" "+ employee.netSalary());


        System.out.println("Qual a porcentagem para aumentar o salário? ");
        double aumento = sc.nextDouble();

        employee.increaseSalary(aumento);

        System.out.println("Dados atualizados : ");
        System.out.println(employee.name+" "+ employee.netSalary());


        sc.close();
    }
}
