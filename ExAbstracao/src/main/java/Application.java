import entities.Company;
import entities.Individual;
import entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of tax payers: ");
        List<TaxPayer> listTaxPayer = new ArrayList<>();
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println("Tax payer #" + i + " data: ");
            System.out.println("Individual or company (i/c)? ");
            char ic = sc.next().charAt(0);
            sc.nextLine();

            System.out.println("Name : ");
            String name = sc.nextLine();

            System.out.println("Anual income : ");
            double anualIncome = sc.nextDouble();


            if (ic == 'i'){

                System.out.println("Health expenditures:");
                double healthExpediture = sc.nextDouble();


                TaxPayer taxPayer = new Individual(name,anualIncome,healthExpediture);

                listTaxPayer.add(taxPayer);
            } else if (ic == 'c') {

                System.out.println("Number of employees:");
                int numberOfEmployers = sc.nextInt();

                TaxPayer taxPayer = new Company(name,anualIncome,numberOfEmployers);
                listTaxPayer.add(taxPayer);
                
            }

        }

        for (TaxPayer taxPayer : listTaxPayer ){
            System.out.println("Name : " + taxPayer.getName() + " ,Tax : " + taxPayer.tax());
        }



        sc.close();

    }
}
