package s06;

import java.util.Scanner;

/**
 * Faça um programa para ler um número indeterminado de dados,
 * contendo cada um, a idade de um indivíduo. O último dado, que
 * não entrará nos cálculos, contém um valor de idade negativa.
 * Calcular e imprimir a idade média deste grupo de indivíduos.
 * Se for entrado um valor negativo na primeira vez, mostrar
 * a mensagem "impossível calcular!
 */

public class Aula47_exercicioResolvido2 {

	public static void main(String[] args) {

		int idade, contador = 0, soma = 0;
		double media = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite uma idade:");
		idade = sc.nextInt();
		
		if (idade >= 0) {
			
			while (idade >= 0) {
				contador++;
				soma += idade;
				System.out.println("Digite outra idade:");
				idade = sc.nextInt();
			}
			
			media = (double) soma / contador;
			System.out.printf("média das idades é %.2f\n", media);
			
		} else {
			System.out.println("Impossível calcular");
		}
		
		sc.close();

	}

}
