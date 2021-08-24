import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Fazer um programa para ler as medidas da largura e comprimento de um
		 * terreno retangular com uma casa decimal, bem como o valor do metro 
		 * quadrado do terreno com duas casas decimais. Em seguida, o programa 
		 * deve mostrar o valor da área do terreno, bem como o valor do preço do 
		 * terreno, ambos com duas casas decimais, conforme exemplo.
		 * 
		 *  Entrada:
		 *  10.0
		 *  30.0
		 *  200.00
		 *  
		 *  Saída:
		 *  Area = 300.00
		 *  Preço = 60000.00
		 * */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double largura, comprimento, metroQuadrado, area, preco;
		
		System.out.print("Digite a largura do terreno: ");
		largura = sc.nextDouble();
		System.out.print("Digite o comprimento do terreno: ");
		comprimento = sc.nextDouble();
		System.out.println("Digite o valor do metro quadrado");
		metroQuadrado = sc.nextDouble();
		
		area = largura * comprimento;
		preco = area * metroQuadrado;
		
		System.out.printf("A área é %.2f\n", area);
		System.out.printf("O valor do terreno é %.2f\n", preco);
		
		sc.close();

	}

}
