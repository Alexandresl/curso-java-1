package s6;

import java.util.Scanner;

/**
 * Fazer um programa para ler três números inteiros e
 * mostrar na tela o maior deles
 */

public class Aula59_exemplo1 {

	public static void main(String[] args) {
		
		int num1, num2, num3, maior;
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite 3 números: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		maior = retornaMaior(num1, num2, num3);
		
		mostraResultado(maior);
		
		sc.close();
		
	}
	
	public static int retornaMaior(int num1, int num2, int num3) {
		int maior = num1;
		
		if (num2 > maior) {
			maior = num2;
		}
		if (num3 > maior) {
			maior = num3;
		}
		
		return maior;
	}
	
	public static void mostraResultado(int maior) {
		
		System.out.println("Maior: " + maior);
		
	}

}
