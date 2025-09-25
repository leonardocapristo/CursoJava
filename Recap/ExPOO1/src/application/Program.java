package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Rectangle retangulo = new Rectangle();
		
		System.out.println("Digite o comprimento do retangulo: ");
		retangulo.widht = sc.nextDouble();
		
		
		System.out.println("Digite a altura do retangulo: ");
		
		retangulo.height = sc.nextDouble();
		
		System.out.println("Area: " + retangulo.area(retangulo.widht, retangulo.height));
		System.out.println("Perimetro: " + retangulo.perimeter(retangulo.widht, retangulo.height));
		System.out.println("Diagonal: " + retangulo.diagonal(retangulo.widht, retangulo.height));

		sc.close();
		
	}

}
