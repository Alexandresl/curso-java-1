package s06;

import java.util.Scanner;

/**
 * Fazer um programa que lê um valor inteiro N
 * e depois N números inteiros. Ao final mostra
 * a soma dos N números lidos.
 */

public class Aula48_exemplo1 {

	public static void main(String[] args) {

		int num = 0, i, qtd, soma = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de números:");
		qtd = sc.nextInt();
		
		for (i = 0; i < qtd; i++) {
			System.out.printf("Digite %d de %d números:", i + 1, qtd);
			num = sc.nextInt();
			soma += num;
		}
		
		System.out.println("O total é: " + soma);
		
		sc.close();
	}

}
