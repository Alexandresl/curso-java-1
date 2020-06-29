package s4;

import java.util.Locale;
import java.util.Scanner;

/**
 * Fazer um programa para ler as medidas da largura e comprimento de um terreno
 * retangular com uma casa decimal, bem como o valor do metro quadrado do terreno
 * com duas casas decimais. Em seguida, o programa deve mostrar o valor da área do
 * terreno, bem como o valor do preço do terreno, ambos com duas casas decimais,
 * conforme exemplo.
 */

public class Aula28_exercicioResolvido {

	public static void main(String[] args) {

		double largura, comprimento, valorMetro, area, valorTerreno;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a largura do terreno:");
		largura = sc.nextDouble();
		System.out.println("Digite o comprimento do terreno:");
		comprimento = sc.nextDouble();
		System.out.println("Digite o valor do metro quadrado:");
		valorMetro = sc.nextDouble();
		
		area = largura * comprimento;
		valorTerreno = area * valorMetro;
		
		System.out.printf("A área do terreno é %.2f\n", area);
		System.out.printf("O valor do terreno é %.2f", valorTerreno);
		sc.close();

	}

}
