package program;

import java.util.Scanner;

/**
 * Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma destes números com uma
 * mensagem explicativa, conforme exemplos.
 */

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int soma = n1 + n2;
		System.out.println("SOMA = " + soma);
		
		sc.close();

	}

}
