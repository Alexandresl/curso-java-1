package p4_Orientacao_objetos.Aula65_exemplo1.application;

import java.util.Locale;
import java.util.Scanner;

import p4_Orientacao_objetos.Aula65_exemplo1.entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Product prod = new Product();

		System.out.println("Enter product data:");
		System.out.print("Name: ");
		prod.name = sc.next();
		System.out.print("Price: ");
		prod.price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		prod.quantity = sc.nextInt();
		
		System.out.printf(
				"\nProduct data: %s, $ %.2f, %d units, Total: $ %.2f", 
				prod.name, 
				prod.price, 
				prod.quantity, 
				prod.totalValueInStock()
				);
		
		System.out.print("\n\nEnter the number of products to be added in stock: ");
		prod.addProducts(sc.nextInt());
		
		System.out.printf(
				"\nProduct data: %s, $ %.2f, %d units, Total: $ %.2f", 
				prod.name, 
				prod.price, 
				prod.quantity, 
				prod.totalValueInStock()
				);
		
		System.out.print("\n\nEnter the number of products to be removed from stock: ");
		prod.removeProducts(sc.nextInt());
		
		System.out.printf(
				"\nProduct data: %s, $ %.2f, %d units, Total: $ %.2f", 
				prod.name, 
				prod.price, 
				prod.quantity, 
				prod.totalValueInStock()
				);
		
		sc.close();
	}

}
