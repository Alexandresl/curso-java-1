import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Leia 1 valor inteiro N, que representa o número de casos de teste que vem
		 * a seguir. cada caso de teste consiste de 3 valores reais, cada um deles 
		 * com uma casa decimal. Apresente a média ponderada para cada um dos testes
		 * conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo 
		 * valor tem peso 3 e o terceiro tem peso 5.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			double r1 = sc.nextDouble();
			double r2 = sc.nextDouble();
			double r3 = sc.nextDouble();
			double media = ((r1 * 2) + (r2 * 3) + (r3 * 5)) / 10;
			System.out.printf("%.1f\n", media);
		}
		
		sc.close();

	}

}
