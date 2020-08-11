package program;

import java.util.Locale;
import java.util.Scanner;

/**
 * Fazer um programa para ler as medidas da largura e comprimento de um terreno
 * retangular com uma casa decimal, bem como o valor do metro quadrado do terreno
 * com duas casas decimais. Em seguida, o programa deve mostrar o valor da área do
 * terreno, bem como o valor do preço do terreno, ambos com duas casas decimais,
 * conforme exemplo.
 */

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double largura, comprimento, metroQuadrado;
		
		System.out.print("Digite a largura do terreno: ");
		largura = sc.nextDouble();
		System.out.print("Digite o comprimento do terreno: ");
		comprimento = sc.nextDouble();
		System.out.print("Digite o valor do metro quadrado do terreno: ");
		metroQuadrado = sc.nextDouble();
		
		double area = largura * comprimento;
		System.out.printf("AREA = %.2f\n", area);
		double preco = area * metroQuadrado;
		System.out.printf("PRECO = %.2f\n", preco);
		
		sc.close();
		
	}

}
