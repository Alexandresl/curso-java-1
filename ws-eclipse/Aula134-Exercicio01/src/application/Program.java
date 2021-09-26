package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayers;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<TaxPayers> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			
			TaxPayers taxpayers;
			
			System.out.println("Tax payer #" + (i + 1) + " data:");
			System.out.print("Individual or company (i/c)? ");
			char tp = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income ");
			double anualIncome = sc.nextDouble();
			
			if (tp == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				
				taxpayers = new Individual(name, anualIncome, healthExpenditures);
				
			} else {
				System.out.print("Number of employees: ");
				int numberOfEmployees = sc.nextInt();
				
				taxpayers = new Company(name, anualIncome, numberOfEmployees);
				
			}
			
			list.add(taxpayers);
			
		}
		
		double total = 0.0;
		
		System.out.println();
		System.out.println("TAXES PAID:");
		for (TaxPayers tp : list) {
			System.out.printf("%s: $ %.2f\n", tp.getName(), tp.tax());
			total += tp.tax();
		}
		System.out.println();
		System.out.printf("TOTAL TAXES: $ %.2f\n", total);
		sc.close();

	}

}
