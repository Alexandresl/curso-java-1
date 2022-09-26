package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		for (int i = 0; i < vect.length; i++) {
			
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
			
		}
		
		double major = vect[0];
		int positionMajor = 0;
		
		for (int i = 0; i < vect.length; i++) {
			
			if (vect[i] > major) {
				major = vect[i];
				positionMajor = i;
			}
			
		}
		
		System.out.println();
		System.out.printf("MAIOR VALOR = %.1f%n", major);
		System.out.println("POSICAO DO MAIOR VALOR = " + positionMajor);
		
		sc.close();

	}

}
