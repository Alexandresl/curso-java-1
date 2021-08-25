import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Leia 2 valores com uma casa decimal (x e y), que devem representar as
		 * coordenadas de um ponto em um plano. A seguir, determine qual o
		 * quadrante ao qual pertence o ponto, ou se está sobre um dos eixos
		 * cartesianos ou na origem (x = y = 0).
		 * 
		 * Se o ponto estever na origem, escreva a mensagem "Origem".
		 * 
		 * Se o ponto estiver sobre um dos eixos escreva "Eixo x" ou "Eixo y",
		 * conforme for a situação.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double x, y;
		
		System.out.println("Escreva dois números que representam as coordenadas:");
		x = sc.nextDouble();
		y = sc.nextDouble();
		
		if (x == 0 && y == 0 ) {
			System.out.println("Origem");
		} else if (x == 0) {
			System.out.println("Eixo x");
		} else if (y == 0) {
			System.out.println("Eixo y");
		} else if (x > 0 && y > 0) {
			System.out.println("Q1");
		} else if (x > 0 && y < 0) {
			System.out.println("Q4");
		} else if (x < 0 && y > 0) {
			System.out.println("Q2");
		} else {
			System.out.println("Q3");
		}
		
		sc.close();

	}

}
