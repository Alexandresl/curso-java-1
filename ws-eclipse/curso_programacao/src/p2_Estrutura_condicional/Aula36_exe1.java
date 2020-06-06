package p2_Estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

/**
 * Uma operadora de telefonia cobra R$ 50.00 por um plano
 * básico que dá direito a 100 minutos de telefone. Cada
 * minuto que exceder a franquia de 100 minutos 
 * custa R$ 2.00. Fazer um programa para ler a quantidade
 * de minutos que uma pessoa consumiu, daí mostrar o valor a 
 * ser pago.
 * 
 * exemplos:
 * 
 * Entrada -> 22 | Saída: Valor a pagar: R$ 50.00
 * Entrada -> 103 | Saída: Valor a pagar: R$ 56.00
 */

public class Aula36_exe1 {
	public static void main(String[] args) {
		
		int qtdMinutos;
		double valorTotal;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de minutos consumidos");
		qtdMinutos = sc.nextInt();
		
		valorTotal = 50.0;
		
		if (qtdMinutos > 100) {
			valorTotal += (qtdMinutos - 100) * 2.0;
		}
		
		System.out.printf("Valor a pagar: R$ %.2f", valorTotal);
		
		sc.close();
	}
}
