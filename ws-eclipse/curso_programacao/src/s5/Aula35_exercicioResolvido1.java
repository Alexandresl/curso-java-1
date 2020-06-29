package s5;

import java.util.Locale;
import java.util.Scanner;

/**
 * Fazer um programa para ler as duas notas que um aluno
 * obteve no primeiro e segundo sermestres de uma disciplina 
 * anual. Em seguida, mostrar a nota final que o aluno obteve
 * no ano juntamente com um texto explicativo. Caso a nota
 * final do aluno seja inferior a 60.00, mostrar a mensagem
 * "Reprovado", conforme exemplos. Todos os valores devem ter
 * uma casa decimal.
 */

public class Aula35_exercicioResolvido1 {

	public static void main(String[] args) {

		double n1, n2, nFinal;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite as duas notas do aluno:");
		n1 = sc.nextDouble();
		n2 = sc.nextDouble();
		
		nFinal = n1 + n2;
		System.out.printf("Nota final: %.1f\n", nFinal);
		
		if (nFinal < 60.0) {
			System.out.println("Reprovado");
		}
		
		sc.close();

	}

}
