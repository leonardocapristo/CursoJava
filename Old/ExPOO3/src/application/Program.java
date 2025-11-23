package application;

import java.util.Scanner;

import util.Student;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Student aluno = new Student();
		System.out.println("Digite o nome do aluno:");
		
		aluno.name = sc.nextLine();
		System.out.println("Digite a nota do primeiro trimestre (máximo 30 pontos):");
		
		aluno.n1 = sc.nextDouble();
		System.out.println("Digite a nota do segundo trimestre (máximo 35 pontos):");
		
		aluno.n2 = sc.nextDouble();
		System.out.println("Digite a nota do terceiro trimestre (máximo 35 pontos):");
		
		aluno.n3 = sc.nextDouble();
		
		System.out.println(aluno.verifyGrades());
		
		sc.close();

	}

}
