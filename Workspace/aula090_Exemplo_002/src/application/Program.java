package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		Product[] products = new Product[n];
		double sum = 0;
		
		for (int i = 0; i < products.length; i++) {
			
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			sum += price;
			products[i] = new Product(name, price);
			
		}
		
		double avg = sum / products.length;
		
		System.out.printf("AVAREGE PRICE = %.2f%n", avg);
		
		sc.close();

	}

}
