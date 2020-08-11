package program;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new java.util.Scanner(System.in);
		
		int number = sc.nextInt();
		int hours = sc .nextInt();
		double value = sc.nextDouble();
		
		double salary = hours * value;
		
		System.out.println("NUMBER = " + number);
		System.out.println("SALARY = U$ " + String.format("%.2f\n", salary));
		
		sc.close();

	}

}
