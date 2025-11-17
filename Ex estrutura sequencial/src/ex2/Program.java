package ex2;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nome1,nome2;
        int idade1,idade2;
        double media;

        System.out.println("Digite os dados da primeira pessoa : ");
        System.out.printf("Nome : ");
        nome1 = scanner.nextLine();
        System.out.printf("Idade: ");
        idade1 = scanner.nextInt();
        scanner.nextLine();


        System.out.println("Digite os dados da segunda pessoa : ");
        System.out.printf("Nome : ");
        nome2 = scanner.nextLine();
        System.out.printf("Idade: ");
        idade2 = scanner.nextInt();

        media = (idade1+idade2) / 2;

        System.out.printf("A idade média de %s e %s é de %.2f",nome1,nome2,media);

        scanner.close();

    }
}
