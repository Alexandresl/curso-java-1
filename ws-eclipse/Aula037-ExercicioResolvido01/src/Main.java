import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Fazer um programa para ler as duas notas que um aluno obteve no
		 * primeiro e segundo semestres de uma disciplina anual. Em seguida,
		 * mostrar a nota final que o aluno obteve no ano untamente com um texto
		 * explicativo. Caso a nota final do aluno seja inferior a 60.00, 
		 * mostrar a mensagem "REPROVADO", conforme exemplos. Todos os valores 
		 * devem ter uma casa decimal.
		 * */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double nota1, nota2, notaFinal;
		
		System.out.print("Digite a nota 1: ");
		nota1 = sc.nextDouble();
		System.out.print("Digite a nota 2: ");
		nota2 = sc.nextDouble();
		notaFinal = nota1 + nota2;
		
		System.out.printf("Nota final = %.1f\n", notaFinal);
		if (notaFinal < 60.0) {
			System.out.println("Reprovado");
		}
		
		sc.close();

	}

}
