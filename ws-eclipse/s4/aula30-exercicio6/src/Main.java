import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Fazer um programa que leia tr�s valores com ponto flutuante de dupla
		// precis�o: A, B e C. Em seguida, calcule e mostre:
		// a) a �rea do tri�ngulo ret�ngulo que tem A por base e C por algura
		// b) a �rea do c�rculo de raio C. (PI = 3.14159)
		// c) a �rea do trap�zio que tem A e B por bases e C por altura
		// d) a �rea do quadrado que tem lado B
		// e) a �rea do ret�ngulo que tem lados A e B.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C;
		double PI = 3.14159;
		
		System.out.print("Digite tr�s valores de ponto flutuante: ");
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		double respostaA = A * C / 2;
		double respostaB = PI * Math.pow(C, 2);
		double respostaC = (A + B) * (C / 2);
		double respostaD = Math.pow(B, 2);
		double respostaE = A * B;
		
		System.out.printf("A �rea do Tri�ngulo �: %.3f\n", respostaA);
		System.out.printf("A �rea do C�rculo �: %.3f\n", respostaB);
		System.out.printf("A �rea do Trap�zio �: %.3f\n", respostaC);
		System.out.printf("A �rea do Quadrado �: %.3f\n", respostaD);
		System.out.printf("A �rea do Ret�ngulo �: %.3f\n", respostaE);
		
		sc.close();

	}

}
