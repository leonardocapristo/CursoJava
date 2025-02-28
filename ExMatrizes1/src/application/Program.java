package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o tamanho da matriz (Ex :'3' para 3x3)");
		
		/* matriz é um vetor de vetores
		 
		 int[][] mat = new int[quantos vetores][tamanho deles];
		 
		 Ex : int[][] mat = new int[3][5];
		 
		 	  vetor nao preenchido
		 
		 vetor 0
		  0
		  1
		  2
		  3
		  4

		 vetor 1
		  0
		  1
		  2
		  3
		  4

		 vetor 2
		  0 
		  1
		  2
		  3
		  4

		  
		  
		  OU
		  
		  vetor nao preenchido
		             0  1  2  3  4  
		  Vetor 0:  [0, 0, 0, 0, 0]
		  Vetor 1:  [0, 0, 0, 0, 0]
          Vetor 2:  [0, 0, 0, 0, 0]

		
		*/

		int n = sc.nextInt();
		int[][] mat = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.println("Digite o número da posição : "+ "Vetor : " + i + ", Posição :" + j);
				mat[i][j] = sc.nextInt();
			}
		}

		sc.close();
	}
}