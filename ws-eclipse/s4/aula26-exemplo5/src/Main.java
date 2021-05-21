import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String x;
		int y;
		double z;
		
		System.out.println("Digite uma string, um inteiro e um decimal:");
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		
		System.out.printf("Foram digitados: %s - %d - %f", x, y, z);
		
		sc.close();

	}

}
