package p2_Estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

/**
 * Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade
 * deste item. A seguir, calcule e mostre o valor da conta a pagar.
 * 
 * ------------------------------------------------------
 * | 	CODIGO	| 	ESPECIFICAÇÃO 		| 	PREÇO 		|
 * ------------------------------------------------------
 * | 	1 		| 	Cachorro Quente 	|	R$ 4.00 	|
 * | 	2 		| 	X-Salada 			| 	R$ 4.50 	|
 * | 	3 		| 	X-Bacon 			| 	R$ 5.00 	|
 * | 	4 		| 	Torrada Simples 	| 	R$ 2.00 	|
 * | 	5 		| 	Refrigerante 		| 	R$ 1.50 	|
 * ------------------------------------------------------
 */

public class Aula35_exercicio5 {

	public static void main(String[] args) {

		int cod, qtd;
		double valorTotal;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o código do item e sua quantidade:");
		cod = sc.nextInt();
		qtd = sc.nextInt();
		
		if (cod == 1) {
			valorTotal = qtd * 4.00;
		} else if (cod == 2) {
			valorTotal = qtd * 4.50;
		} else if (cod == 3) {
			valorTotal = qtd * 5.00;
		} else if (cod == 4) {
			valorTotal = qtd * 2.00;
		} else {
			valorTotal = qtd * 1.50;
		}
		
		Locale.setDefault(Locale.US);
		System.out.printf("Total: R$ %.2f\n", valorTotal);
		
		sc.close();

	}

}
