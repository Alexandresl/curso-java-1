package p2_Estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

/**
 *  Problema do site URI
 *  https://www.urionlinejudge.com.br/judge/pt/problems/view/1036
 *  
 *  Leia 3 valores de ponto flutuante e efetue o cálculo das raízes
 *  da equação de Bhaskara. Se não for possível calcular as raízes,
 *  mostre a mensagem correspondente "impossível calcular", caso haja
 *  uma divisão por 0 ou raiz de número negativo.
 *  
 *  Entrada:
 *  Leia três valores de ponto flutuante (double) A, B e C
 *  
 *  Saída:
 *  Se não houver possibilidade de calcular as raízes, apresente a
 *  mensagem "Impossível calcular". Caso contrário, imprima o resultado
 *  das raízes com 5 dígitos após o ponto, com uma mensagem correspondente
 *  conforme exemplo abaixo. Imprima sempre o final da linha após cada
 *  mensagem.
 */

public class Aula35_exercicioResolvido2 {

	public static void main(String[] args) {

		double A, B, C, delta, r1, r2;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite três números com ponto flutuante");
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		delta = Math.pow(B, 2) - 4.0 * A * C;
		
		if (delta < 0 || A == 0) {
			System.out.println("Impossível calcular");
		} else {
			r1 = (-B + Math.sqrt(delta)) / (2.0 * A); 
			r2 = (-B - Math.sqrt(delta)) / (2.0 * A);
			System.out.printf("R1 = %.5f\nR2 = %.5f\n", r1, r2);
		}

		sc.close();
	}

}
