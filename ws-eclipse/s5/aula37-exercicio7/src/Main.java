import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Leia 2 valores com uma casa decimal (x e y), que
		// devem representar as coordenadas de um ponta em um
		// plano. A seguir, determine qual o quadrante ao qual
		// pertence o ponto, ou se está sobre um dos eixos
		// cartesianos ou na origem (x = y = 0).
		// Se o ponto estiver na origem, escreva a mensagem
		// "Origem".
		// Se o ponto estiver sobre um dos eixos escreva "Eixo X"
		// ou "Eixo Y", conforme for a situação.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x, y;
		System.out.print("Digite as duas coordenadas: ");
		x = sc.nextDouble();
		y = sc.nextDouble();
		
		if (x > 0) {
			if (y > 0) {
				System.out.println("Q1");
			} else if (y == 0) {
				System.out.println("Sobre o eixo y");
			} else {
				System.out.println("Q4");
			}
		} else if (x < 0) {
			if (y > 0) {
				System.out.println("Q2");
			} else if (y == 0) {
				System.out.println("Sobre o eixo y");
			} else {
				System.out.println("Q3");
			}
		} else {
			if (x != y) {				
				System.out.println("Sobre o eixo x");
			} else {
				System.out.println("Origem");
			}
		}
		
		sc.close();

	}

}
