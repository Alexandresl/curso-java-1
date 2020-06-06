package p3_Estruturas_repetitivas;

import java.util.Scanner;

/**
 * Escreva um progrma que repita a leitura de uma senha até
 * que ela seja válida. Quando a senha for informada corretamente
 * deve ser impressa a mensagem "Acesso Permitido" e o algoritmo
 * encerrado. Considere que a senha correta é o valor 2002.
 */

public class Aula47_exercicio1 {

	public static void main(String[] args) {
		int senha = 2002;
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		while (num != senha) {
			System.out.println("Senha inválida!");
			System.out.println("Tente novamente:");
			num = sc.nextInt();
		}
		System.out.println("Acesso permitido!");
		sc.close();

	}

}
