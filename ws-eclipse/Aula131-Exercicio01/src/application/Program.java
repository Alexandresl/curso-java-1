package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		List<Product> products = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			
			Product prod;
			
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
				double customsFee = sc.nextDouble();
				
				prod = new ImportedProduct(name, price, customsFee);
				
			} else if (type == 'u') {
				
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date manufacture = sdf.parse(sc.next());
				
				prod = new UsedProduct(name, price, manufacture);
				
			} else {
				
				prod = new Product(name, price);
				
			}
			
			products.add(prod);
			
		}
		
		System.out.println();
		System.out.println("PRICE TAGS:");
		
		for (Product prod : products) {
			System.out.println(prod.priceTag());
		}
		
		sc.close();

	}

}
