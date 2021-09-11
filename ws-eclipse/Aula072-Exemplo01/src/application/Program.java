package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Program {

	public static void main(String[] args) {
		
		/*
		 * Fazer um programa para ler um valor numérico qualquer, e daí
		 * mostrar quanto seria o valor de uma circunferência e do 
		 * volume de uma esfera para um raio daquele valor.
		 * 
		 * Informar também o valor de PI com duas casas decimais
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = Calculator.circumference(radius);
		double v = Calculator.volume(radius);
		
		System.out.printf("Circunference: %.2f\n", c);
		System.out.printf("Volume: %.2f\n", v);
		System.out.printf("PI value: %.2f\n", Calculator.PI);
		
		sc.close();

	}

}
