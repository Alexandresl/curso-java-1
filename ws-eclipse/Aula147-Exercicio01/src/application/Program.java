package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe os dados da conta:");
		System.out.print("Número: ");
		int number = sc.nextInt();
		System.out.print("Titular: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Saldo inicial: ");
		Double balance = sc.nextDouble();
		System.out.print("Limite de saque: ");
		Double withdrawLimit = sc.nextDouble();

		Account account = new Account(number, holder, balance, withdrawLimit);

		System.out.println();
		System.out.print("Informe uma quantia para sacar: ");
		Double amount = sc.nextDouble();

		try {
			account.withdraw(amount);
			System.out.printf("Novo saldo: %.2f\n", account.getBalance());
		} catch (DomainException e) {
			System.out.println(e.getMessage());
		}
		sc.close();

	}

}
