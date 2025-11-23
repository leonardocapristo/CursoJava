package application;

import java.util.Scanner;

import util.Room;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Room[] quartos = new Room[10];

		System.out.println("Digite quantos estudantes irão alugar : ");

		int n = sc.nextInt();
		
		for(int i = 0; i< n; i++) {
			
			System.out.println("Digite o numero do quarto de desejado (0-9)");
			int quartoEscolhido = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Digite o nome do estudante : ");
			
			String nomeEstudante = sc.nextLine();
			
			System.out.println("Digite o email do estudante : ");
			
			String emailEstudante = sc.nextLine();
			
			
			Room estudante = new Room(nomeEstudante,emailEstudante);
			
			quartos[quartoEscolhido] = estudante;
			
			
		}
		
		for(int i = 0; i< quartos.length; i++) {
			if(quartos[i] != null) {
				System.out.println(i + " " + quartos[i]);
			}
		}
		
		Room estudante = new Room("troquei","troquei@gmail.com");
		
		quartos[0] = estudante;
		
		for(int i = 0; i< quartos.length; i++) {
			if(quartos[i] != null) {
				System.out.println(i + " " + quartos[i]);
			}
		}
		

		sc.close();

	}

}
