package p4_Orientacao_objetos;

import java.util.Locale;
import java.util.Scanner;

/**
 * Fazer um programa para ler as medidas dos lados de dois triângulos 
 * X e Y (suponha medidas válidas). Em seguida, mostrar o valor das
 * áreas dos dois triângulos e dizer qual dos dois triângulos possui
 * a maior área.
 * A formula para calcular a área de um triângulo a partir das medidas
 * de seus lados a, b e c é a seguinte (fórmula de Heron):
 * 
 * area = sqrt(p(p-a)(p-b)(p-c)) onde p = (a+b+c) / 2
 */

public class Aula62_exemplo1 {

	public static void main(String[] args) {
		
		// Resolução sem orientação a objetos
		
		double xA, xB, xC, yA, yB, yC, areaX, areaY, pX, pY;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite as medidas do triângulo X: ");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		
		System.out.println("Digite as medidas do triângulo Y: ");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
		pX = (xA + xB + xC) / 2;
		areaX = Math.sqrt(pX * (pX-xA) * (pX-xB) * (pX-xC));
		
		pY = (yA + yB + yC) / 2;
		areaY = Math.sqrt(pY * (pY-yA) * (pY-yB) * (pY-yC));
		
		System.out.printf("A área do trinângulo X é %.4f\n", areaX);
		System.out.printf("A área do trinângulo Y é %.4f\n", areaY);
		if (areaX > areaY) {
			System.out.println("A maior área é X");
		} else {
			System.out.println("A maior área é Y");
		}
		sc.close();

	}

}
