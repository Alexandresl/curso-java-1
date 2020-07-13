package s06;

import java.util.Scanner;

/**
 * Leia 2 valores inteiros X e Y. A seguir, calcule
 * e mostre a soma dos números ímpares entre eles
 * 
 * Entrada:
 * O arquivo de entrada contém dois valores inteiros
 * 
 * Saída:
 * O programa deve imprimir um valor inteiro. este valor 
 * é a soma dos valores ímpares que estão entre os valos 
 * fornecidos na entrada que deverá caber em um inteiro
 */

public class Aula52_exercicioResolvido2 {

	public static void main(String[] args) {

		int num1, num2, soma = 0, maior, menor;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite dois números inteiros:");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		if (num1 < num2) {
			menor = num1;
			maior = num2;
		} else {
			menor = num2;
			maior = num1;
		}
		
		for (int i = menor + 1; i < maior; i++) {
			if (i % 2 != 0) {
				soma += i;
			}
		}
		
		System.out.println(soma);
		sc.close();

	}

}
