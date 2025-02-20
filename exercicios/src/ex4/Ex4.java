package ex4;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("DIgite um numero");
		int number1 = 5;
		int number = sc.nextInt();
		
		
		if (number>=0 && number <=25) {
			System.out.println("intervalo de 0-25");
		}
		
		else if (number>=25 && number <=50) {
			System.out.println("intervalo de 25-50");
		}
		
		System.out.println("Maior que 50");
	
		
		sc.close();
	}

}
