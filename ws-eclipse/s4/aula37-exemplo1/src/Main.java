import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Fazer um programa para ler as duas notas que
		// um aluno obteve no primeiro e segundo semestres
		// de uma disciplina anual. Em seguida, mostrar a
		// nota final que o aluno obteve no ano juntamente
		// com um texto explicativo. Caso a nota final do
		// aluno seja inferior a 60.00, mostrar a mensagem
		// "Reprovado", conforme exemplos. Todos os
		// valores devem ter uma casa decimal.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a primeira nota do aluno: ");
		double n1 = sc.nextDouble();
		System.out.print("Digite a segunda nota: ");
		double n2 = sc.nextDouble();
		
		double notaFinal = n1 + n2;
		
		System.out.printf("Nota final: %.1f\n", notaFinal);
		if (notaFinal < 60.0) {
			System.out.println("Reprovado");
		}
		
		sc.close();

	}

}
