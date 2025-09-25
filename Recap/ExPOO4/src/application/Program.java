package application;

import java.util.Scanner;

import utilities.CurrencyConverter;



public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double quantidade;
		System.out.println("preço do dólar : " + CurrencyConverter.DOLAR_PRICE);

		System.out.println("Digite quantos dolares deseja comprar : ");
		quantidade = sc.nextDouble();
		
		System.out.println(CurrencyConverter.conversor(quantidade));
		
		
		

		sc.close();

	}

}
