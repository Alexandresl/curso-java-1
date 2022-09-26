package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		int[] vect = new int[n];
		int qtd = 0;
		int sum = 0;
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
			if (vect[i] % 2 == 0) {
				qtd++;
				sum += vect[i];
			}
		}
		
		if (qtd == 0) {
			System.out.println("NENHUM NUMERO PAR");
		} else {
			double avg = (double) sum / qtd;
			System.out.printf("MEDIA DOS PARES = %.1f%n", avg);
		}
		
		sc.close();

	}

}
