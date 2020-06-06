package p3_Estruturas_repetitivas;

import java.util.Scanner;

/**
 * Ler um número inteiro e calcular todos os
 * seus divisores.
 */

public class Aula52_exe6 {

	public static void main(String[] args) {
		
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro:");
		num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.println(i);
			}
		}
		
		sc.close();
		
	}

}
