package s06;

import java.util.Scanner;

/**
 * Fazer um programa que lê números inteiros até que
 * um zero seja lido. Ao final mostra a soma dos
 * números lidos.
 * 
 * ------------------------------
 * | 	Entrada 	| 	Saída 	|
 * ------------------------------
 * | 	5 			| 	11 		|
 * | 	2 			| 	  		|
 * | 	4 			| 	   		|
 * | 	0 			| 	   		|
 * ------------------------------
 */

public class Aula43_exe1 {

	public static void main(String[] args) {
		
		int num, total = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro");
		num = sc.nextInt();
		
		while (num != 0) {
			total += num;
			System.out.println("Digite um número inteiro");
			num = sc.nextInt();
		}
		
		System.out.println("O valor total é " + total);
		
		sc.close();

	}

}
