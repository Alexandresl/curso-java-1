package s05;

import java.util.Scanner;

/**
 * Fazer um programa para ler um valor inteiro de 1 a 7
 * representando um dia da semana (sendo 1 = domingo,
 * 2 = segunda, e assim por diante).
 * 
 * Escrever na tela o dia da semana correspondente, 
 * conforme exemplo:
 * 
 * Entrada: 1	| 	Saída: Dia da semanda: Domingo
 * Entrada: 4	| 	Saída: Dia da semanda: Quarta
 * Entrada: 9	| 	Saída: Dia da semanda: Valor inválido
 */

public class Aula37_exe1 {

	public static void main(String[] args) {
		
		int num;
		String dia;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número do dia da semana:");
		num = sc.nextInt();
		
		switch (num) {
			case 1:
				dia = "Domingo";
				break;
			case 2:
				dia = "Segunda";
				break;
			case 3:
				dia = "Terça";
				break;
			case 4:
				dia = "Quarta";
				break;
			case 5:
				dia = "Quinta";
				break;
			case 6:
				dia = "Sexta";
				break;
			case 7:
				dia = "Sábado";
				break;
			default:
				dia = "valor inválido";
		}
		
		System.out.printf("Dia da semana: %s", dia);
		sc.close();
	}

}
