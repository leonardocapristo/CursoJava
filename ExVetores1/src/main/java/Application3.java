import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        double[] vetor = {5,6,7,8};


        for (double nmrVetor : vetor){
            System.out.println(nmrVetor);
        }


        vetor[0] = 3;


        for (double nmrVetor : vetor){
            System.out.println(nmrVetor);
        }

        sc.close();
    }
}
