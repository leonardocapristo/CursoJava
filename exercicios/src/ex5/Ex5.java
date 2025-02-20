package ex5;

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;

        while (true) { // Usamos while(true) para continuar pedindo as coordenadas até que pelo menos uma seja 0

            System.out.println("Digite a coordenada de X");
            x = sc.nextInt();

            System.out.println("Digite a coordenada de Y");
            y = sc.nextInt();

            // Verifica se pelo menos uma das coordenadas é 0 para encerrar
            if (x == 0 || y == 0) {
                break; // Encerra o loop se uma coordenada for 0
            }

            if (x > 0 && y > 0) {
                System.out.println("Primeiro quadrante");
            } else if (x < 0 && y > 0) {
                System.out.println("Segundo quadrante");
            } else if (x < 0 && y < 0) {
                System.out.println("Terceiro quadrante");
            } else if (x > 0 && y < 0) {
                System.out.println("Quarto quadrante");
            }
        }

        // Verificação após o loop para coordenadas nulas
        if (x == 0 && y != 0) {
            System.out.printf("Centro de X e Y = %d\n", y);
        } else if (y == 0 && x != 0) {
            System.out.printf("Centro de Y e X = %d\n", x);
        }

        sc.close();
    }
}
