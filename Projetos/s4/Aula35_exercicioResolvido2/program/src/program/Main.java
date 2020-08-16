package program;

import java.util.Locale;
import java.util.Scanner;

/**
 * Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação de Bhaskara.
 * Se não for possível calcular as raízes, mostre a mensagem correspondente "Impossível calcular",
 * caso haja uma divisão por 0 ou raiz de número negativo.
 * 
 * Entrada:
 * Leia três valores de ponto flutuante (double) A, B e C.
 * 
 * Saída:
 * Se não houver possibilidade de calcular as raízes, apresente a mensagem "Impossível Calcular".
 * Caso contrário, imprima o resultado das raízes com 5 dígitos após o ponto, com uma mensagem
 * correpsondente conforme exemplo abaixo. Imprima sempre o final dea linha após cada mensagem.
 * 
 * Link do problema original: https://www.urionlinejudge.com.br/judge/pt/problems/view/1036
 * 
 * Exercício resolvido em https://www.youtube.com/watch?v=3lhkB5I8P6E
 */

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		double delta = Math.pow(b, 2) - 4 * a * c;
		
		if (delta <= 0 || a == 0) {
			System.out.println("Impossível calcular");
		} else {
			double r1 = (- b + Math.sqrt(delta)) / (2 * a);
			double r2 = (- b - Math.sqrt(delta)) / (2 * a);
			
			System.out.printf("R1 = %.5f\n", r1);
			System.out.printf("R2 = %.5f\n", r2);
				
		}
		
		sc.close();

	}

}
