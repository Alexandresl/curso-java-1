package s4;

import java.util.Scanner;

/**
 * Faça um programa para ler dois valores inteiros, e 
 * depois mostrar na tela a soma desses números com uma 
 * mensagem explicativa, conforme exemplos.
 * Exe.: Soma = 40
 */

public class Aula28_exercicio1 {

	public static void main(String[] args) {
		
		int num1, num2, soma;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número:");
		num1 = sc.nextInt();
		System.out.println("Digite o segundo número:");
		num2 = sc.nextInt();
		soma = num1 + num2;
		System.out.printf("Soma = %d\n", soma);
		
		sc.close();

	}

}
