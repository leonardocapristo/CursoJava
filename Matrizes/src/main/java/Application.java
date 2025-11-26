import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);



        // matriz é um vetor de vetores

        // int[][] matriz = new int[quantidade de vetores][ tamanho dos vetores];

        int[][] matriz = new int[3][3];

        matriz[0][2] = 2;

        matriz[2][0] = 27;

        int[][] matriz2 = new int[3][3];



        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2.length ; j++) {
                matriz2[i][j] = sc.nextInt();
                
            }
            
        }




    }
}
