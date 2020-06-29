package s4;

import java.util.Locale;
import java.util.Scanner;

/**
 *Faça um programa para ler o valor do raio de um círculo, e 
 *depois mostrar o valor da área deste círculo com quatro
 *casas decimais conforme exemplos.
 *Fórmula da área: area = pi . raio^2
 *Considere o valor do pi = 3.14159
 */

public class Aula28_exercício2 {

	public static void main(String[] args) {
		
		double raio, area, pi = 3.14159;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o raio do círculo:");
		raio = sc.nextDouble();
		area = pi * Math.pow(raio, 2);
		System.out.printf("Área = %.4f", area);
		
		sc.close();
		
	}
	
}
