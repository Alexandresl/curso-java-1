package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		
		/*
		 * Faça um programa para ler a cotação do dólar, e depois um valor
		 * em dolares a ser comprado por uma pessoa em reais. Informar quantos
		 * reais a pessoa vai pagar pelos dólares, considerando ainda que a 
		 * pessoa terá que pagar 6% de IOF sobre o valor do dólar. Criar uma
		 * classe CurrencyConverter para ser responsávvel pelos cálculos
		 * 
		 * Exemplo:
		 * what is the dollar price? 3.10
		 * How many dollars will be bought? 200.00
		 * Amount to be paid in reais = 657.20
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("what is the dollar price? ");
		double dollarPrice = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double dollarAmount = sc.nextDouble();
		System.out.printf(" Amount to be paid in reais = %.2f\n", CurrencyConverter.dollarToReal(dollarPrice, dollarAmount));
		sc.close();

	}

}
