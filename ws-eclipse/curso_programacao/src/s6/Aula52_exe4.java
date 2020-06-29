package s6;

import java.util.Scanner;

/**
 * Fazer um programa para ler um número N. Depois leia N
 * pares de números e mostre a divisão do primeiro pelo
 * segundo. Se o denominador for igual a zero, mostrar
 * a mensagem "divisão impossível"
 */

public class Aula52_exe4 {

	public static void main(String[] args) {
		
		int cont, n1, n2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de pares:");
		cont = sc.nextInt();
		
		for (int i = 1; i <= cont; i++) {
			System.out.println("Digite um par de números:");
			n1 = sc.nextInt();
			n2 = sc.nextInt();
			
			if (n2 == 0) {
				System.out.println("Divisão im possível!");
			} else {
				System.out.println((double) n1 / n2);
			}
		}
		
		sc.close();

	}

}
