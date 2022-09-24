package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Account account;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter acount holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		char d = sc.next().charAt(0);
		
		if (d == 'y') {
			
			System.out.print("Enter inicial deposit value: ");
			double balance = sc.nextDouble();
			
			account = new Account(number, holder, balance);
			
		} else {
			
			account = new Account(number, holder);
			
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a depoisit value: ");
		double value = sc.nextDouble();
		account.deposit(value);
		System.out.println("Updated ccount data:");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter withdraw value: ");
		value = sc.nextDouble();
		account.withdraw(value);
		System.out.println("Updated ccount data:");
		System.out.println(account);
		
		sc.close();

	}

}
