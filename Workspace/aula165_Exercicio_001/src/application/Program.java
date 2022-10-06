package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		List<TaxPayer> list = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			
			System.out.println("Tax payer #" + (i + 1) + " data");
			System.out.print("Individual or company (i/c)? ");
			char type = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual Income: ");
			Double anualIncome = sc.nextDouble();
			
			if (type == 'i') {
				
				System.out.print("Health expenditures: ");
				Double HealthExpenditures = sc.nextDouble();
				
				list.add(new Individual(name, anualIncome, HealthExpenditures));
				
			} else {
				
				System.out.print("Number of employees: ");
				Integer numberOfEmployees = sc.nextInt();
				
				list.add(new Company(name, anualIncome, numberOfEmployees));
				
			}
			
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		
		Double sum = 0.0;
		
		for (TaxPayer tp : list) {
			
			System.out.printf("%s: $ %.2f%n", tp.getName(), tp.tax());
			sum += tp.tax();
			
		}
		
		System.out.println();
		System.out.printf("TOTAL TAXES: $ %.2f%n", sum);
		
		sc.close();

	}

}
