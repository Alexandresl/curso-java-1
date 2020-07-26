package s15.Aula144_exercicio1.application;

import java.util.Locale;
import java.util.Scanner;

import s15.Aula144_exercicio1.model.entities.Account;
import s15.Aula144_exercicio1.model.exception.DomainException;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		try {

			System.out.println("Enter account data");
			System.out.print("Number: ");
			int number = sc.nextInt();
			System.out.print("Holder: ");
			sc.next();
			String holder = sc.next();
			System.out.print("Initial balance: ");
			Double balance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			Double widhdrawLimit = sc.nextDouble();

			Account acc = new Account(number, holder, balance, widhdrawLimit);

			System.out.println();
			System.out.print("Enter amount for withdraw: ");
			Double amount = sc.nextDouble();
			acc.withdraw(amount);
			System.out.println("New balance: " + String.format("%.2f", acc.getBalance()));

		} catch (DomainException e) {
			
			System.out.println("Withdraw error: " + e.getMessage());
			
		}
		
		sc.close();

	}

}
