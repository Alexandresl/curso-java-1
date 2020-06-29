package s4;

import java.util.Scanner;

/**
 *Fazer um programa para ler quatro valores inteiros A, B, C e D.
 *A seguir, calcule e mostre a diferença do produto de A e B pelo
 *produto de C e D segundo a fórmula: Diferença = (A * B - C * D).
 */

public class Aula28_exercício3 {

	public static void main(String[] args) {
		
		int A, B, C, D, diferenca;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite quatro valores inteiros:");
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		diferenca = A * B - C * D;
		System.out.printf("Diferença = %d", diferenca);
		
		sc.close();
	}
	
}
