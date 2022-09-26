package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();

		Person[] vect = new Person[n];
		double sumHeight = 0;

		for (int i = 0; i < vect.length; i++) {

			System.out.println("Dados da " + (i + 1) + "a pessoa:");
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Idade: ");
			int age = sc.nextInt();
			System.out.print("Altura: ");
			double height = sc.nextDouble();
			sumHeight += height;
			vect[i] = new Person(name, age, height);

		}

		double avgHeight = sumHeight / vect.length;

		System.out.println();
		System.out.printf("Altura média: %.2f%n", avgHeight);

		int minor = 0;

		for (int i = 0; i < vect.length; i++) {

			if (vect[i].getAge() < 16) {
				minor++;
			}

		}

		double minorPercent = minor * 100 / vect.length;

		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", minorPercent);

		for (int i = 0; i < vect.length; i++) {

			if (vect[i].getAge() < 16) {
				System.out.println(vect[i].getName());
			}

		}

		sc.close();

	}

}
