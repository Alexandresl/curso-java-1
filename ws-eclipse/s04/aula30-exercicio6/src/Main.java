import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Fazer um programa que leia três valores com ponto flutuante de dupla
		// precisão: A, B e C. Em seguida, calcule e mostre:
		// a) a área do triângulo retângulo que tem A por base e C por algura
		// b) a área do círculo de raio C. (PI = 3.14159)
		// c) a área do trapézio que tem A e B por bases e C por altura
		// d) a área do quadrado que tem lado B
		// e) a área do retângulo que tem lados A e B.
		
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
