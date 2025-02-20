package ex2;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x,y;
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		
		
		int resultado = x+y;
		
		System.out.printf("SOMA = %d", resultado);
		
		sc.close();
		
		
	}

}
