package program;

import java.util.Locale;
import java.util.Scanner;

/**
 * Fazer um programa para ler as duas notas que um aluno obteve no primeiro e
 * segundo semestres de uma disciplina anual. Em seguida, mostrar a nota final que o
 * alguno obteve no ano juntamente com um texto explicativo. Caso a nota final do aluno
 * seja inferior a 60.00, mostrar a mensagem "REPROVADO", conforme exemplos. Todos
 * os valores devem ter uma casa decimal.
 * 
 * Exercício resolvido em https://www.youtube.com/watch?v=SRyQZBaA-_s
 */

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		
		double notaFinal = (n1 + n2);
		
		System.out.println("NOTA FINAL = " + String.format("%.1f", notaFinal));
		
		if (notaFinal < 60.0) {
			System.out.println("REPROVADO");
		}
		
		sc.close();
		
	}

}
