package p3_Estruturas_repetitivas;

import java.util.Scanner;

/**
 * Leia um valor inteiro X (1 <= x <= 1000). Em seguida
 * mostre os ímpares de 1 até x, um valor por linha,
 * inclusive o X, se for o caso.
 */

public class Aula52_exe1 {

	public static void main(String[] args) {
		
		int x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor entre 1 e 1000:");
		x = sc.nextInt();
		
		for (int i = 1; i <= x; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		sc.close();

	}

}
