package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		int[] vect = new int[n];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
		}
		
		int pair = 0;
		
		System.out.println();
		System.out.println("NUMEROS PARES:");
		
		for (int i = 0; i < vect.length; i++) {
			
			if (vect[i] % 2 == 0) {
				System.out.print(vect[i] + " ");
				pair++;
			}
			
		}
		
		System.out.println();
		System.out.println();
		System.out.println("QUANTIDADE DE PARES = " + pair);
		
		sc.close();

	}

}
