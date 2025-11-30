import entities.Account;
import exceptions.LimiteInsuficienteException;
import exceptions.SaldoInsuficienteException;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter account data");
            System.out.println("Number : ");
            int number = sc.nextInt();
            sc.nextLine();
            System.out.println("Holder : ");
            String holder = sc.nextLine();
            System.out.println("Initial balance : ");
            double initialBalance = sc.nextDouble();
            System.out.println("Withdraw limit : ");
            double withdrawLimit = sc.nextDouble();

            Account account = new Account(number,holder,initialBalance,withdrawLimit);

            System.out.println("Enter amount for withdraw : ");
            double amount = sc.nextDouble();

            account.withdraw(amount);


            System.out.println("Saldo atual : " +  account.getBalance());

            sc.close();

        } catch (LimiteInsuficienteException e) {
            System.out.println(e.getMessage());
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }

    }
}
