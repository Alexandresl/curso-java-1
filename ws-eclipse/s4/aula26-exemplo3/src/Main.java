import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double x;
		
		System.out.println("Digite o resultado de 5 dividido por 2:");
		x = sc.nextDouble();
		System.out.println("O resultado é " + x);

	}

}
