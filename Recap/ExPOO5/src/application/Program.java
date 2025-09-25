package application;


import java.util.Scanner;

import account.UserAccount;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberAccount;
		String nameAccount;
		double chooseInitialDeposit;
		double initialDeposit;

		System.out.println("Digite o número da conta para ser criada : ");
		numberAccount = sc.nextInt();
		sc.nextLine();
		System.out.println("Digite o nome do titular da conta : ");
		nameAccount = sc.nextLine();
		System.out.println("Deseja fazer um depósito incial ? (Digite 1 para sim e 2 para não)");
		chooseInitialDeposit = sc.nextDouble();

		while (chooseInitialDeposit != 1 && chooseInitialDeposit != 2) {
			System.out.println("Opção invalida, digite novamente : ");
			chooseInitialDeposit = sc.nextDouble();
		}
		
		if (chooseInitialDeposit == 1) {
			System.out.println("Digite o valor do depósito: ");
			initialDeposit = sc.nextDouble();

		} else {
			initialDeposit = 0;

		}

		UserAccount conta1 = new UserAccount(numberAccount, nameAccount,initialDeposit);

		System.out.println(conta1);
		
		
		System.out.println("faça um depósito: ");
		double valueDeposit = sc.nextDouble();
		conta1.deposit(valueDeposit);
		System.out.println(conta1);
		
		System.out.println("faça um saque: ");
		double valueWithdrawal = sc.nextDouble();
		conta1.withdrawal(valueWithdrawal);
		System.out.println(conta1);
		

		sc.close();
		
	}

}
