package s6;

import java.util.Locale;
import java.util.Scanner;

/**
 * Fazer um programa para ler uma temperatura em Celsius e mostrar
 * o equivalente em fahrenheit. Perguntar se o usuário deseja 
 * repetir (s/n). Caso o usuário digite "s", repetir o programa.
 * Formula:
 * F = 9*C/5+32
 */

public class Aula53_exemplo1 {

	public static void main(String[] args) {
		
		double c, f;
		char option;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		do {
			
			System.out.print("Digite uma temperatura em Celsius: ");
			c = sc.nextDouble();
			f = 9*c/5+32;
			System.out.printf("Equivalente em Fahrenheit: %.1f\n", f);
			System.out.print("Deseja repetir (s/n)? ");
			option = sc.next().charAt(0);
			
		} while (option == 's');
		
		sc.close();

	}

}
