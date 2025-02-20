package ex3;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int number;
		
		System.out.println("Digite um número: ");
		number = sc.nextInt();
		
		if (number < 0) {
			System.out.println("Número negativo");
		}
		
		else if (number > 0) {
			System.out.println("Número positivo");
		}
		
		System.out.println("vc digitou 0");
		
		sc.close();

	}

}
