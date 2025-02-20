package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product produto1 = new Product();
		
		System.out.println("Digite o nome do produto: ");
		produto1.name = sc.nextLine();
		
		System.out.println("Digite o preço do produto: ");
		produto1.price = sc.nextDouble();
		
		System.out.println("Digite a quantidade do produto: ");
		produto1.quantity = sc.nextInt();
		
		System.out.println(produto1.name + "," +"R$" + produto1.price + "," + produto1.quantity);

		sc.close();
	}

}
