package s10.Aula97_exercicio1.application;

import java.util.Scanner;

/**
 * Fazer um programa para ler um n�mero inteiro N e uma matriz de ordem N
 * contendo n�meros inteiro. Em seguida, mostrar a diagonal principal e a
 * quantidade de valores negativos da matriz.
 */

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[][] vetor = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				vetor[i][j] = sc.nextInt();
			}
		}

		System.out.println("Main diagonal:");

		for (int i = 0; i < n; i++) {
			System.out.print(vetor[i][i] + " ");
		}

		System.out.println();
		System.out.print("Negative numbers = ");

		int Count = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (vetor[i][j] < 0) {
					Count++;
				}
			}
		}

		System.out.println(Count);

		sc.close();

	}

}
