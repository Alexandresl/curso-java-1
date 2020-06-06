package p3_Estruturas_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Aula42_exe1 {

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
