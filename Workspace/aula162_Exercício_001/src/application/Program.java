package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		List<Product> prod = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
		
			System.out.println("Product #" + (i + 1) + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char type = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			Double price = sc.nextDouble();
			
			if (type == 'i') {
				
				System.out.print("Customs fee: ");
				Double customsFee = sc.nextDouble();
				
				prod.add(new ImportedProduct(name, price, customsFee));
				
			} else if (type == 'u') {
				
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				String manufactureDate = sc.next();
				
				prod.add(new UsedProduct(name, price, LocalDate.parse(manufactureDate, dtf)));
				
			} else {
				
				prod.add(new Product(name, price));
				
			}
			
		}
		
		System.out.println();
		System.out.println("PRICE TAGS:");
		
		for (Product p : prod) {
			System.out.println(p.priceTag());
		}
		
		sc.close();

	}

}
