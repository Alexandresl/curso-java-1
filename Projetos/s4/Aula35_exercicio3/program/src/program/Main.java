package program;

import java.util.Scanner;

/**
 * Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "São múltiplos" ou "Não são 
 * múltiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
 * ordem crescente ou decrescente.
 */

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if (a % b == 0 || b % a == 0) {
			System.out.println("SAO MULTIPLOS");
		} else {
			System.out.println("NAO SAO MULTIPLOS");
		}
		
		sc.close();

	}

}
