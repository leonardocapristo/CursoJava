package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		Employee empregado1 = new Employee();
		
		
		System.out.println("Digite o nome do empregado : ");
		empregado1.name = sc.nextLine();
		
		System.out.println("Digite o salário bruto do empregado : ");
		
		empregado1.grossSalary = sc.nextDouble();
		
		System.out.println("Digite os descontos do salário do empregado : ");
		empregado1.tax = sc.nextDouble();
		
		
		System.out.println("Nome: " + empregado1.name + ", Salário líquido : " + empregado1.netSalary());
		
		System.out.println("Digite a porcentagem de aumento do salário: ");
		
		double porcentagem = sc.nextDouble();
		
		empregado1.increaseSalary(porcentagem);
		
		System.out.println("Nome: " + empregado1.name + ", Salário líquido : " + empregado1.netSalary());
		
		
		sc.close();

	}

}
