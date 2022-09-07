import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double largura, comprimento, metroQuadrado, area, preco;
		
		System.out.print("Digite a largura: ");
		largura = sc.nextDouble();
		System.out.print("Digite o comprimento: ");
		comprimento = sc.nextDouble();
		System.out.print("Digite o preco do metro quadrado: ");
		metroQuadrado = sc.nextDouble();
		
		area = largura * comprimento;
		preco = area * metroQuadrado;
		
		System.out.println();
		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PRECO = %.2f%n", preco);
		
		sc.close();

	}

}
