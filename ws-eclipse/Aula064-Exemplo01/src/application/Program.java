package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		/*
		 * Fazer um programa para ler as medidas dos 
		 * lados de dois triângulos x e y (suponha
		 * medidas válidas. Em seguida, mostrar o
		 * valor das áreas dos dois triângulos e
		 * dizer qual dos dois triângulos possui
		 * a maior área.
		 * 
		 * A fórmula para calcular a área de um
		 * triângulo a partir das medidas de seus
		 * lados a, b e c é a seguinte (fórmula
		 * de Heron):
		 * 
		 * area = V¨p(p-a)(p-b)(p-c)¨ onde:
		 * 
		 * p = _a_+_b_+_c_
		 *          2
		 *          
		 * 
		 * Exemplo:
		 * Enter the measures of triangle X:
		 * 3.00
		 * 4.00
		 * 5.00
		 * Enter the measures of triangle Y:
		 * 7.50
		 * 4.50
		 * 4.02
		 * Triangle X area: 6.0000
		 * Triangle Y area: 7.5638
		 * Larger area: Y
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double xA, xB, xC, yA, yB, yC;
		
		System.out.println("Enter the measures of triangle X: ");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		System.out.println("Enter the measures of triangle Y: ");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
		double p = (xA + xB + xC) / 2.0;
		double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
		
		p = (yA + yB + yC) / 2.0;
		double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
		
		System.out.printf("Triangle X area: %.4f\n", areaX);
		System.out.printf("Triangle Y area: %.4f\n", areaY);
		String larger = (areaX > areaY) ? "X" : "Y";
		System.out.print("Larger area: " + larger);
		
		sc.close();

	}

}
