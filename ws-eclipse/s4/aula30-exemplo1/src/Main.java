import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Fazer um programa para ler as medidas da largura e comprimento de um terreno
		// retangular com uma casa decimal, bem como o valor do metro quadrado do terreno
		// com duas casas decimais. Em seguida, o programa deve mostrar o valor da área do
		// terreno, bem como o valor do preço do terreno, ambos com duas casas decimais,
		// conforme exemplo.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a largura do terreno: ");
		double largura = sc.nextDouble();
		System.out.print("Digite o comprimento do terreno: ");
		double comprimento = sc.nextDouble();
		System.out.print("Digite o valor do metro quadrado: ");
		double valor = sc.nextDouble();
		
		double area = largura * comprimento;
		double valorTotal = area * valor;
		
		System.out.printf("A área do terreno é %.2f\n", area);
		System.out.printf("O preço do terreno é %.2f\n", valorTotal);
		
		sc.close();
	}

}
