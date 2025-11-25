import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("quantos nmrs vai digitar : ");
        int n = sc.nextInt();

        double[] vect = new double[n];


        for (int i = 0; i < n; i++) {


            System.out.printf("digite o número %d : ", i);
            double nmr = sc.nextDouble();

            vect[i] = nmr;
        }


        for (int i = 0; i < vect.length; i++) {

            if ((vect[i] % 2) == 0){

                System.out.println(vect[i]);

            }
        }
    }
}
