import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Leia 3 valores de ponto flutuante e efetue o
		// cálculo das raízes da equação de Bhaskara.
		// Se não for possível calcular as raízes,
		// mostre a mensagem correspondente "impossível
		// calcular", caso haja uma divisão por 0 ou raiz
		// de número negativo.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 3 números: ");
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		double delta = Math.pow(B, 2) - 4.0 * A * C;
		
		if (delta <= 0.0 || A == 0.0) {
			System.out.println("Impossível calcular");
		} else {
			double r1 = (-B + Math.sqrt(delta)) / (2 * A);
			double r2 = (-B - Math.sqrt(delta)) / (2 * A);
			System.out.printf("R1 = %.5f\n", r1);
			System.out.printf("R2 = %.5f\n", r2);
		}
		
		sc.close();

	}

}
