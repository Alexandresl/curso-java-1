import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C;
		double PI = 3.14159;
		
		System.out.print("Digite três valores de ponto flutuante: ");
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		double respostaA = A * C / 2;
		double respostaB = PI * Math.pow(C, 2);
		double respostaC = (A + B) * (C / 2);
		double respostaD = Math.pow(B, 2);
		double respostaE = A * B;
		
		System.out.printf("A área do Triângulo é: %.3f\n", respostaA);
		System.out.printf("A área do Círculo é: %.3f\n", respostaB);
		System.out.printf("A área do Trapézio é: %.3f\n", respostaC);
		System.out.printf("A área do Quadrado é: %.3f\n", respostaD);
		System.out.printf("A área do Retângulo é: %.3f\n", respostaE);
		
		sc.close();

	}

}
