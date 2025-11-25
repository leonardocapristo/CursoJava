import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("quantos nmrs vai digitar : ");
        int n = sc.nextInt();


        double[] vetor = new double[n];


        for (int i = 0; i < n; i++) {


            System.out.printf("digite o número %d : ", i);
            double nmr = sc.nextDouble();

            vetor[i] = nmr;
        }

        double nmrMaior = vetor[0];

        for (int i = 0; i < vetor.length; i++) {

            if (vetor[i] > nmrMaior){
                nmrMaior = vetor[i];
            }

        }

        System.out.println(nmrMaior);

    }
}
