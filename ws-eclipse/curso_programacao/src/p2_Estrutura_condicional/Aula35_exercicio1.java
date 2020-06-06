package p2_Estrutura_condicional;

import java.util.Scanner;

/**
 * Fazer um programa para ler um número inteiro, e depois dizer se este número
 * é negativo ou não.
 */

public class Aula35_exercicio1 {

	public static void main(String[] args) {
		
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro:");
		num = sc.nextInt();
		
		if (num >= 0) {
			System.out.println("Não negativo");
		} else {
			System.out.println("Negativo");
		}
		
		sc.close();

	}

}
