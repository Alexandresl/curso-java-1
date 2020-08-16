package program;

import java.util.Scanner;

/**j
 * Fazer um programa para ler três números inteiros. Em seguida, mostrar qual o
 * menor dentre os três números lidos. Em caso de empate, mostrar apenas uma vez
 */

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if (a < b && a < c) {
			System.out.println("MENOR = " + a);
		} else if (b < c) {
			System.out.println("MENOR = " + b);
		} else {
			System.out.println("MENOR = " + c);
		}
		
		sc.close();

	}

}
