package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import entities.Account;
import exceptions.LimiteInsuficienteException;
import exceptions.SaqueException;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Digite os dados da conta");
			System.out.println("Digite o numero da conta : ");
			int number = sc.nextInt();
			sc.nextLine();
			System.out.println("Digite o nome do dono da conta : ");
			String holder = sc.nextLine();
			System.out.println("Digite o saldo inicial da conta : ");
			double balance = sc.nextDouble();
			System.out.println("Digite o valor de limite de saque : ");
			double withdrawLimit = sc.nextDouble();

			Account account = new Account(number, holder, balance, withdrawLimit);

			while (true) {
				System.out.println("Digite a opção desejada : ");

				System.out.println("1 - Depósito");
				System.out.println("2 - Saque");
				System.out.println("0 - Encerrar programa");

				double amount = 0;
				int x = sc.nextInt();

				if (x == 1) {
				    System.out.println("Digite o valor para depositar: ");
				    amount = sc.nextDouble();
				    account.deposit(amount);
				    System.out.println("Saldo atualizado: " + account.getBalance());
				} else if (x == 2) {
				    System.out.println("Digite o valor para saque: ");
				    amount = sc.nextDouble();
				    account.withdraw(amount);
				    System.out.println("Saldo atualizado: " + account.getBalance());
				} else if (x == 0) {
				    break;
				} else {
				    System.out.println("Opção inválida, por favor tente novamente: ");
				}

			}
		} catch (SaqueException e) {

			System.out.println(e.getMessage());
		} 
		
		catch (LimiteInsuficienteException e) {
			System.out.println(e.getMessage());
		}catch (InputMismatchException e) {
			System.out.println("dados invalidos");
		}

		sc.close();
	}

}
