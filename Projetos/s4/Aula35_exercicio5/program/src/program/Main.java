package program;

import java.util.Scanner;

/**
 * Com base na tebela abaixo, escreva um programa que leia o código
 * de um item e a quantidade deste item. A seguir, calcule e mostre 
 * o valor da conta a pagar.
 */

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int item = sc.nextInt();
		int qtd = sc.nextInt();
		double total;
		
		if (item == 1) {
			total = 4.0 * qtd;
		} else if (item == 2) {
			total = 4.5 * qtd;
		} else if (item == 3) {
			total = 5.0 * qtd;
		} else if (item == 4) {
			total = 2.0 * qtd;
		} else {
			total = 1.5 * qtd;
		}
		
		System.out.printf("Total: R$ %.2f\n", total);
		
		sc.close();

	}

}
