package application;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite quantos funcionários irá adicionar : ");

		int n = sc.nextInt();
		sc.nextLine();

		List<Employee> listaFuncionarios = new ArrayList<Employee>();

		for (int i = 0; i < n; i++) {

			System.out.println("Digite os dados do funcionário #" + i + " : ");
			System.out.println("É funcionário terceirizado ? (y/n) : ");
			String resposta = sc.nextLine().toLowerCase();

			System.out.println("Digite o nome : ");
			String name = sc.nextLine();

			System.out.println("Digite as horas trabalhadas : ");
			int hours = sc.nextInt();
			System.out.println("Digite o valor por hora : ");
			double valuePerHour = sc.nextDouble();
			sc.nextLine();

			if (resposta.equals("y")) {

				Employee employee = new OutsourcedEmployee(name, hours, valuePerHour);
				listaFuncionarios.add(employee);
			} else {

				Employee employee = new Employee(name, hours, valuePerHour);
				listaFuncionarios.add(employee);

			}

			System.out.println("Pagamentos : ");

		}

		for (Employee employee : listaFuncionarios) {

			System.out.println(employee.getName() + " - " + employee.payment());
		}

		sc.close();

	}

}
