package ex1;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        double media,n1,n2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira nota : ");
        n1 = sc.nextDouble();

        System.out.println("Digite a segunda nota : ");
        n2 = sc.nextDouble();

        media = (n1+n2) / 2;


        if (media >= 60 ) {
            System.out.println("aprovado");
        }else {
            System.out.println("reprovado");
        }



    }
}
