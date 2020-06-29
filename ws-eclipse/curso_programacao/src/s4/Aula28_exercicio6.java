package s4;

import java.util.Locale;
import java.util.Scanner;

/**
 * Fazer um programa que leia três valores com ponto flutuante de 
 * dupla precisão: A, B e C. Em seguida, calcule e mostre:
 * a) a área do triângulo retângulo que tem A por vase e C por altura
 * b) a área do círculo de raio C. (pi = 3.14159)
 * c) a área do trapézio que tem A e B por bases e C por altura
 * d) a área do quadrado que tem lado B.
 * e) a área do retângulo que tem lados A e B
 */

public class Aula28_exercicio6 {

	public static void main(String[] args) {
		
		double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo, pi = 3.14159;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite três números com ponto flutuante:");
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		triangulo = A * C / 2;
		circulo = pi * Math.pow(C, 2);
		trapezio = (A + B) * C / 2;
		quadrado = Math.pow(B, 2);
		retangulo = A * B;
		System.out.printf(
				"Triângulo: %.3f\nCírculo: %.3f\nTrapézio: %.3f\nQuadrado: %.3f\nRetângulo: %.3f",
				triangulo,
				circulo,
				trapezio,
				quadrado,
				retangulo);
		sc.close();

	}

}
