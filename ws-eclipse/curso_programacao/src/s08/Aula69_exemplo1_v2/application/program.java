package s08.Aula69_exemplo1_v2.application;

import java.util.Locale;
import java.util.Scanner;

import s08.Aula69_exemplo1_v2.util.Calculator;

/**
 * Fazer um programa para ler um valor numérico qualquer, e daí
 * mostrar quanto seria o valor de uma circunferência e do volume
 * de uma esfera para um ario daquele valor. Informar também o valor
 * PI com duas casas decimais.
 */

public class program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Calculator calc = new Calculator();
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		double  c = calc.circumference(radius);
		double v = calc.volume(radius);
		System.out.printf("Circunference: %.2f\n", c);
		System.out.printf("Volume: %.2f\n", v);
		System.out.printf("PI value: %.2f\n", calc.PI);
		sc.close();
		
	}

}
