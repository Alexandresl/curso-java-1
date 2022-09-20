package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.println("Enter product data:");
		System.out.print("Name: ");
		product.name = sc.nextLine();
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		product.quantity = sc.nextInt();
		
		System.out.println();
		System.out.print("Product data: ");
		System.out.println(product);
		System.out.println();
		
		System.out.print("Enter the number of products to be jadded in stock: ");
		product.addProducts(sc.nextInt());
		System.out.println();
		System.out.print("Updated data: ");
		System.out.println(product);
		System.out.println();
		
		System.out.print("Enter the number of products to be removed from stock: ");
		product.removeProducts(sc.nextInt());
		System.out.println();
		System.out.print("Updated data: ");
		System.out.println(product);
		
		sc.close();

	}

}
