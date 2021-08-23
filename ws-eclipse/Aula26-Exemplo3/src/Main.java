import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Para ler um número com ponto flutuante
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x;
		
		x = sc.nextDouble();
		
		System.out.println("Você digitou: " + x);
		
		sc.close();

	}

}
