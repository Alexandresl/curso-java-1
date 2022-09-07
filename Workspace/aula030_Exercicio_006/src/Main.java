import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, area;
		double pi = 3.14159;
		
		System.out.println("Digite três valores com ponto flutuante:");
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		System.out.println();
		area = A * C / 2;
		System.out.printf("TRIANGULO: %.3f%n", area);
		area = pi * Math.pow(C, 2);
		System.out.printf("CIRCULO: %.3f%n", area);
		area = (A + B) * C / 2;
		System.out.printf("TRAPEZIO: %.3f%n", area);
		area = Math.pow(B, 2);
		System.out.printf("QUADRADO: %.3f%n", area);
		area = A * B;
		System.out.printf("RETANGULO: %.3f%n", area);
		
		sc.close();

	}

}
