package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double xA, xB, xC, yA, yB, yC, xP, xY, xArea, yArea;
		
		System.out.println("Enter the measures of triangle X:");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		
		xP = (xA + xB + xC) / 2;
		xArea = Math.sqrt(xP * (xP - xA) * (xP - xB) * (xP - xC));
		
		System.out.println("Enter the measures of triangle Y:");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
		xY = (yA + yB + yC) / 2;
		yArea = Math.sqrt(xY * (xY - yA) * (xY - yB) * (xY - yC));
		
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
