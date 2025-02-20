package entradaDeDados;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome;
		int x;
		double y;
		
		nome = sc.next();
		x = sc.nextInt();
		y = sc.nextDouble();
		
		System.out.printf("Voce digitou: %d ", x);
		System.out.printf("Voce digitou: %.2f ", y);
		System.out.printf("Voce digitou: %s ", nome);
		
		sc.close();
	}

}
