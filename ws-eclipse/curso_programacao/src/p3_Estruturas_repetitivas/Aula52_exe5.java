package p3_Estruturas_repetitivas;

import java.util.Scanner;

/**
 * Ler um valor N. Calcular e escrever seu respectivo fatorial.
 * Fatorial de N = N * (N-1) * (N-2) * ... * 1. Lembrando que,
 * por definição, fatorial de 0 é 1.
 */

public class Aula52_exe5 {

	public static void main(String[] args) {

		int num, fat;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número para calcular seu fatorial!");
		num = sc.nextInt();
		
		fat = num;
		
		if (num == 0) {
			System.out.println(1);
		} else {
			for (int i = num; i > 1; i--) {
				fat = fat * (i - 1);
			}
			System.out.println("teste: " + fat);
		}
		
		sc.close();

	}

}
