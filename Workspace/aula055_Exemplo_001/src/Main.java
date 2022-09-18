import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char option;
		
		do {
			
			System.out.print("Digite a temperatura em Celcius: ");
			double c = sc.nextDouble();
			double f = 9 * c / 5 + 32;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", f);
			System.out.print("Deseja repetir (s/n): ");
			option = sc.next().charAt(0);
			
		} while (option == 's');
		
		sc.close();

	}

}
