package p1_Estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

/**
 * 
 *Fazer um programa para ler o código de uma peça 1, o
 *número de peças 1, o valor unitário de cada peça 1, o
 *código de uma peça 2, o número de peças 2 e o valor
 *unitário de cada peça 2. Calcule e mostre o valor 
 *a ser pago
 */

public class Aula28_exercicio5 {

	public static void main(String[] args) {
		
		int numPeca1, numPeca2;
		double valorPeca1, valorPeca2, total;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		

		System.out.println("Digite o número de peças 1:");
		numPeca1 = sc.nextInt();
		System.out.println("Digite o valor da peça 1:");
		valorPeca1 = sc.nextDouble();
		System.out.println("Digite o número de peças 2:");
		numPeca2 = sc.nextInt();
		System.out.println("Digite o valor da peça 2:");
		valorPeca2 = sc.nextDouble();
		total = numPeca1 * valorPeca1 + numPeca2 * valorPeca2;
		System.out.printf("O Valor a pagar: R$ %.2f\n", total);

		sc.close();
	}

}
