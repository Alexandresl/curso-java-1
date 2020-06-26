package p4_Orientacao_objetos.Aula68_exercicio1.application;

import java.util.Locale;
import java.util.Scanner;

import p4_Orientacao_objetos.Aula68_exercicio1.entities.Rectangle;

/**
 * Fazer um programa para ler os valores da largura e altura de um retângulo.
 * Em seguida, mostrar na tela o valor de sua área, perímetro e diagonal. Usar
 * uma classe como mostrado no projeto ao lado.
 * 
 * area = largura * altura
 * perimetro = largura + largura + altura + altura
 * diagonal^2 = largura^2 + altura^2
 */

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle ret = new Rectangle();
		
		System.out.println("Enter rectangle width and height: ");
		ret.width = sc.nextDouble();
		ret.height = sc.nextDouble();
		
		System.out.printf("AREA = %.2f\n", ret.area());
		System.out.printf("PERIMETER = %.2f\n", ret.perimeter());
		System.out.printf("DIAGONAL = %.2f\n", ret.diagonal());
		
		sc.close();

	}

}
