import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Faça um programa para ler o valor do raio de um  círculo, e depois
		// mostrar o valor da área deste círculo com quatro casas decimais.
		
		// Fórmula da área: area = PI * raio²
		
		// Considere PI = 3.14159
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double PI = 3.14159;
		
		System.out.print("Digite o raio de um círculo: ");
		double raio = sc.nextDouble();
		double area = PI * Math.pow(raio, 2);
		System.out.printf("A área do Círculo é %.4f\n", area);
		sc.close();

	}

}
