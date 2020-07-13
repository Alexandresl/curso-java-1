package s06;

import java.util.Scanner;

/**
 * Fazer um programa para ler um número inteiro
 * positivo N. O programa deve então mostrar na
 * tela N linhas, começando de 1 até N. Para
 * cada linha, mostrar o número de linha, depois
 * o quadrado e o cubo do valor, conforme
 * exemplo.
 */

public class Aula52_exe7 {

	public static void main(String[] args) {
		
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um inteiro positivo:");
		n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			double n2 = Math.pow(i, 2);
			double n3 = Math.pow(i, 3);
			System.out.printf("%d %.0f %.0f\n", i, n2, n3);
		}
		
		sc.close();

	}

}
