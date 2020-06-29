package s5;

import java.util.Scanner;

/**
 * Fazer um programa para ler três números inteiros. Em
 * seguida, mostrar qual o menor dentre os três números
 * lidos. Em caso de empate, mostrar apenas uma vez.
 */

public class Aula35_exercicioResolvido3 {

	public static void main(String[] args) {
		
		int n1, n2, n3, menor;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 3 números inteiros:");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		
		menor = n1;
		
		if (n2 < menor) {
			menor = n2;
		}
		
		if (n3 < menor) {
			menor = n3;
		}
		
		System.out.println("Menor = " + menor);
		
		sc.close();
		
	}

}
