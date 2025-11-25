import java.util.Scanner;

public class Application {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int n =  sc.nextInt();
        double[] vect = new double[10];

        for (int i = 0; i < n; i++) {

            vect[i] = sc.nextDouble();

        }


        for (int i = 0; i < vect.length; i++) {

            System.out.println(vect[i]);

        }

    }
}
