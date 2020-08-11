package program;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int code1 = sc.nextInt();
		int quantity1 = sc.nextInt();
		double value1 = sc.nextDouble();
		int code2 = sc.nextInt();
		int quantity2 = sc.nextInt();
		double value2 = sc.nextDouble();
		
		double total = quantity1 * value1 + quantity2 * value2;
		
		System.out.println("CODIGOS: " + code1 + " - " + code2 );
		System.out.println("VALOR A PAGAR: R$ " + String.format("%.2f\n", total));
		
		sc.close();

	}

}