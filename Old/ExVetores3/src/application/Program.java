package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Digite o número de pessoas : ");
		int numeroPessoas = sc.nextInt();
		sc.nextLine();
		
		
		String[] vetorNome = new String[numeroPessoas];
		int[] vetorIdade = new int[numeroPessoas];
		double[] vetorAltura = new double[numeroPessoas];
		
		
		for (int i = 0; i < numeroPessoas ; i++) {
			System.out.println("Digite o nome da pessoa da posição: " + i);
			vetorNome[i] = sc.nextLine();
			
			System.out.println("Digite a idade da pessoa da posição: " + i);
			vetorIdade[i] = sc.nextInt();
			
			System.out.println("Digite a altura da pessoa da posição: " + i);
			vetorAltura[i] = sc.nextDouble();
			sc.nextLine();
		}
		
		
		for (int i = 0; i < vetorAltura.length; i++) {
			System.out.println(vetorAltura[i]);
		}
		
		sc.close();

	}

}
