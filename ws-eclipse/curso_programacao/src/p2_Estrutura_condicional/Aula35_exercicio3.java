package p2_Estrutura_condicional;

import java.util.Scanner;

/**
 * Leia 2 valores inteiros (A e B). Após, o programa deve mostrar
 * uma mensagem "são múltiplos" ou "Não são múltiplos", indicando
 * se os valores lidos são múltiplos entre si. Atenção: os números
 * devem poder ser digitados em ordem crescente ou decrescente.
 */

public class Aula35_exercicio3 {
	
	public static void main(String[] args) {
		
		int a, b;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 2 números inteiros");
		a = sc.nextInt();
		b = sc.nextInt();
		
		if (a % b == 0 || b % a == 0) {
			System.out.println("São múltiplos");
		} else {
			System.out.println("Não são múltiplos");
		}
		
		sc.close();
		
	}
	
}
