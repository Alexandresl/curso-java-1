import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/**
		 * Faça um programa para ler o valor do raio do círculo, e depois
		 *  mostrar o valor da área deste círculo com quatro casas decimais
		 *  conforme exemplos.
		 *  
		 *  Fórmula da área: area = pi * raio²
		 *  
		 *  considere o valor de pi = 3.14159
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double raio, area, pi;
		pi = 3.14159;
		
		System.out.print("Digite o raio do círculo: ");
		raio = sc.nextDouble();
		
		area = pi * Math.pow(raio, 2);
		
		System.out.printf("A área do círculo é %.4f\n", area);
		
		sc.close();
		
	}

}
