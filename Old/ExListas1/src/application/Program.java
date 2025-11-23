package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import util.Employee;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o número de funcionarios a serem registrados: ");
		Integer numeroFuncinários = sc.nextInt();
		sc.nextLine();
		
		List<Employee> listaFuncionarios = new ArrayList<Employee>();
		
		for (int i = 0; i < numeroFuncinários; i++) {
			System.out.println("Funcinário #" + i);
			System.out.println("Nome : ");
			String name = sc.nextLine();
			System.out.println("ID : ");
			Integer id = sc.nextInt();
			System.out.println("Salário : ");
			Double salary = sc.nextDouble();
			sc.nextLine();
			
			Employee funcionario = new Employee(id, name, salary);
			
			listaFuncionarios.add(funcionario);
			
			
			
		}
		
		for (int i = 0; i < listaFuncionarios.size(); i++) {
			System.out.println(listaFuncionarios.get(i));
		}
		
		System.out.print("Digite o ID do funcionário que deseja aumentar o salário: ");
		int idBuscado = sc.nextInt();

		for (int i = 0; i < listaFuncionarios.size(); i++) {
		    if (listaFuncionarios.get(i).getId() == idBuscado) {
		        System.out.print("Digite a porcentagem de aumento: ");
		        double aumento = sc.nextDouble();
		        listaFuncionarios.get(i).increaseSalary(aumento);
		        System.out.println("Salário atualizado: " + listaFuncionarios.get(i));
		        break; // Sai do loop ao encontrar o funcionário
		    }
		}

		
		

		sc.close();
	}

}
