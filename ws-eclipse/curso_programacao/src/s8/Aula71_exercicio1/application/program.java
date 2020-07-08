package s8.Aula71_exercicio1.application;

import java.util.Locale;
import java.util.Scanner;

import s8.Aula71_exercicio1.utils.CurrencyConverter;

/**
 * Fa�a um programa para ler a cota��o do d�lar, e depois um valor em d�lares
 * a ser comprado por uma pessoa em reais. Informar quantos reais a pessoa vai
 * pagar pelos d�lares, considerando ainda que a pessoa ter� que pagar 6% de
 * IOF sobre o valor em d�lar. Criar uma colasse CurrencyConverter para ser 
 * respons�vel pelos c�lculos.
 */

public class program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double dollarPrice = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double quantityDollar = sc.nextDouble();
		System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.converter(dollarPrice, quantityDollar));
		
		sc.close();

	}

}