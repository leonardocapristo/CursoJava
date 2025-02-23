package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos numeros vc vai digitar ? ");
		int n = sc.nextInt();
		int vect[] = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Digite o número para a posição : " + i);
			int numberVect = sc.nextInt();
			vect[i] = numberVect;

		}
		int soma = 0;
		for (int i = 0; i < n; i++) {
			soma = soma + vect[i];
			
			
		}

		System.out.println("a soma é " + soma);
		
		double media = soma /n;
		
		System.out.printf("a media é %.2f" , media);

		sc.close();
	}

}
