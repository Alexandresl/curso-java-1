package application;

import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Rent[] rents = new Rent[10];
		
		System.out.print("How mani rooms will be rented? ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			sc.nextLine();
			System.out.println();
			System.out.println("Rent #" + i + ":");
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Room: ");
			int room = sc.nextInt();
			rents[room] = new Rent(name, email);
		}
		
		System.out.println();
		System.out.println("Busy rooms:");
		
		for (int i = 0; i < rents.length; i++) {
			if (rents[i] != null) {
				System.out.println(i + ": " + rents[i]);
			}
		}
		
		sc.close();

	}

}
