package program;

import java.util.Locale;
import java.util.Scanner;



/**
 * Faça um programa para ler o valor do raio de um círculo, ,e depois mostrar o valor da área deste círculo com quatro
 * casas decimais, conforme exemplos.
 * Formula da área: area = pi . raio^2
 * considere o valor de pi = 3.14159
 */

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new java.util.Scanner(System.in);
		double pi = 3.14159;
		
		
		double raio = sc.nextDouble();
		double area = pi * Math.pow(raio, 2);
		
		System.out.printf("A=%.4f\n", area);
		
		sc.close();
		

	}

}
