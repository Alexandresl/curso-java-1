package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Enter the measures of triangle X:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		double xP = (x.a + x.b + x.c) / 2;
		double xArea = Math.sqrt(xP * (xP - x.a) * (xP - x.b) * (xP - x.c));
		
		System.out.println("Enter the measures of triangle Y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double yP = (y.a + y.b + y.c) / 2;
		double yArea = Math.sqrt(yP * (yP - y.a) * (yP - y.b) * (yP - y.c));
		
		System.out.printf("Triangle X area: %.4f%n", xArea);
		System.out.printf("Triangle Y area: %.4f%n", yArea);
		
		if (xArea > yArea) {
			System.out.println("Larger area: X");
		} else {
			System.out.println("Larger area: Y");
		}
		
		sc.close();

	}

}
