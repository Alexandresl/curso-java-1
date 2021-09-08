import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Fazer um programa para ler uma temperatura em Celcius e mostrar o equivalente
		 * em Fahrenheit. Perguntar se o usuário deseja repetir (s/n). Caso o usuário 
		 * digite "s", repetir o programa.
		 * 
		 * Formula: F = 9c/5 + 32
		 *  
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		char controle;
		do {
			System.out.print("Digite a temperatura em Celsius: ");
			double celcius = sc.nextDouble();
			double fahrenheit = 9.0 * celcius / 5.0 + 32.0;
			System.out.printf("Equivalente em fahrenheit: %.1f\n", fahrenheit);
			System.out.print("Deseja repetir (s/n)? ");
			controle = sc.next().charAt(0);
		} while (controle == 's');
		
		sc.close();

	}

}
