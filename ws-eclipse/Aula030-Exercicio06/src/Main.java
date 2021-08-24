import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Fazer um programa que leia três valores com ponto flutuante de dupla
		 * precisão: A, B e C. Em seguida, calcule e mostre:
		 * 
		 * a) a área do triângulo retângulo que tem A por base e C por altura.
		 * b) a área do círculo de raio C. (pi = 3.14159)
		 * c) a área do trapézio que tem A e B por bases e C por altura.
		 * d) a área do quadrado que tem lado B.
		 * e) a área do retângulo que tem lados A e B.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double A, B, C;
		double pi = 3.14159;
		
		System.out.print("Digite três números de ponto flutuante: ");
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		System.out.printf("A área do triângulo é: %.3f\n", A * C / 2);
		System.out.printf("A área do círculo é: %.3f\n", pi * Math.pow(C, 2));
		System.out.printf("A área do trapézio é: %.3f\n", ((A + B) / 2) * C);
		System.out.printf("A área do quadrado é: %.3f\n", Math.pow(B, 2));
		System.out.printf("A área do retângulo é: %.3f\n", A * B);
		
		sc.close();

	}

}
