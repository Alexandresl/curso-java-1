package s10.Aula87_exemplo1.application;

import java.util.Locale;
import java.util.Scanner;

/**
 * Fazer um programa para ler um número inteiro N e a
 * altura de N pessoas. Armazene as N alturas em um vetor.
 * Em seguida, mostrar a altura média dessas pessoas.
 */

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] vect = new double[n];
		double sum = 0.0, avg = 0.0;
		
		for(int i = 0; i < n; i++) {
			vect[i] = sc.nextDouble();
			sum += vect[i];
		}
		
		avg = sum / n;
		
		System.out.printf("AVARAGE HEIGHT = %.2f", avg);
		
		sc.close();

	}

}
