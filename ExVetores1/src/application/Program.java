package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos numeros vc vai digitar ? ");
		int n = sc.nextInt();
		int vetor[] = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Digite um número para posição :  " + i);
			int numeroVetor = sc.nextInt();
			vetor[i] = numeroVetor;
			
		}
		
		System.out.println("Números negativos do vetor : ");
		
		for (int i = 0; i < vetor.length; i++) {
			
			if (vetor[i] < 0) {
				System.out.println(vetor[i]);
			}
			
			
		}
		sc.close();
	}

}
