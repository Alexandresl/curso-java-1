import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Você deve fazer um programa que leia um valor qualquer e apresente
		 * uma mensagem dizendo em qual dos seguintes intervalos ( [0, 25],
		 * (25, 50], (50, 75], (75,100]) este valor se encontra. Obviamente se
		 * o valor não estiver em nenhum destes intervalos, deverá ser impressa
		 * a mensagem "Fora de intervalo".
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double n;
		
		System.out.print("Digite um número com ponto flutuante: ");
		n = sc.nextDouble();
		
		if (n < 0 || n > 100) {
			System.out.println("Fora de intervalo");
		} else if (n >= 0.0 && n <= 25.0) {
			System.out.println("Intervalo [0, 25]");
		} else if (n <= 50.0) {
			System.out.println("Intervalo (25, 50]");
		} else if (n <= 70.0) {
			System.out.println("Intervalo (50, 75]");
		} else {
			System.out.println("Intervalo (75,100]");
		}
		
		sc.close();

	}

}
