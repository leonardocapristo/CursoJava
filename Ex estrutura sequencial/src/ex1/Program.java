package ex1;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        double largura ,comprimento,precoM2,area,valor;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a largura do terreno:");
        largura = scanner.nextDouble();

        System.out.println("Digite o comprimento do terreno:");
        comprimento = scanner.nextDouble();

        System.out.println("Digite o valor do metro quadrado:");
        precoM2 = scanner.nextDouble();

        area = largura * comprimento;

        valor = precoM2 * area;

        System.out.printf("area do terreno = %.2f , valor = %.2f",area,valor);

    }
}
