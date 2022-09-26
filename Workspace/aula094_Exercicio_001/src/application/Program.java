package application;

import java.util.Scanner;

import entities.Room;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		Room[] vect = new Room[10];
		
		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Rent #" + (i + 1));
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int number = sc.nextInt();
			
			for (int j = 0; j < vect.length; j++) {
				if (number == j) {
					vect[j] = new Room(name, email, number);
				}
			}
			
		}
		
		System.out.println();
		System.out.println("Busy rooms:");
		
		for (int i = 0; i < vect.length; i++) {
			
			if (vect[i] != null) {
				System.out.println(vect[i]);
			}
			
		}
		
		sc.close();

	}

}
