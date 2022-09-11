import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double nota1, nota2, notaFinal;
		
		System.out.println("Digite as duas notas do aluno: ");
		nota1 = sc.nextDouble();
		nota2 = sc.nextDouble();
		
		notaFinal = nota1 + nota2;
		
		System.out.printf("NOTA FINAL: %.1f%n", notaFinal);
		
		if (notaFinal < 60.0) {
			System.out.println("REPROVADO");
		}
		
		sc.close();

	}

}
