package s05;

import java.util.Scanner;

/**
 * Fazer um programa para ler um número inteiro e dizer se este número é par
 * ou ímpar.
 */

public class Aula35_exercicio2 {

	public static void main(String[] args) {

		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro");
		num = sc.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("Par");
		} else {
			System.out.println("Ímpar");
		}
		
		sc.close();

	}

}
