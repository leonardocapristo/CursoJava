import entites.Account;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number;
        String holder;
        double balance, deposit, withdraw;
        String initialDeposit;

        System.out.println("Enter account number : ");
        number = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter account holder : ");
        holder = sc.nextLine();
        sc.nextLine();

        System.out.println("Is there a initial deposit (y/n) ? ");
        initialDeposit = sc.nextLine();

        Account account = new Account();

        if (initialDeposit.equals("y")) {

            System.out.println("Enter initial deposit value : ");
            balance = sc.nextDouble();

            account.setHolder(holder);
            account.setBalance(balance);
            account.setNumber(number);

        } else if (initialDeposit.equals("n")) {


            account.setNumber(number);
            account.setHolder(holder);
            
        }

        System.out.println(account);


        System.out.println("Enter a deposit value : ");
        deposit = sc.nextDouble();
        account.deposit(deposit);
        System.out.println(account);


        System.out.println("Enter a withdraw value : ");
        withdraw = sc.nextDouble();
        account.withdraw(withdraw);
        System.out.println(account);



        sc.close();

    }
}
