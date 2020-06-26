package p4_Orientacao_objetos.Aula63_exemplo1.application;

import java.util.Locale;
import java.util.Scanner;
import p4_Orientacao_objetos.Aula63_exemplo1.entities.Triangle;

public class Principal {

	public static void main(String[] args) {
		
		double pX, pY, areaX, areaY;
		Triangle x = new Triangle();
		Triangle y = new Triangle();
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite as medidas do triângulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Digite as medidas do triângulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		pX = (x.a + x.b + x.c) / 2;
		areaX = Math.sqrt(pX * (pX-x.a) * (pX-x.b) * (pX-x.c));
		
		pY = (y.a + y.b + y.c) / 2;
		areaY = Math.sqrt(pY * (pY-y.a) * (pY-y.b) * (pY-y.c));
		
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
