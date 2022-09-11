import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double x, y;
		
		System.out.println("Digite as duas coordenadas:");
		x = sc.nextDouble();
		y = sc.nextDouble();
		
		if (x == 0 && y == 0) {
			System.out.println("Origem");
		} else if (x == 0) {
			System.out.println("Eixo x");
		} else if (y == 0) {
			System.out.println("Eixo y");
		} else if (x > 0 && y > 0) {
			System.out.println("Q1");
		} else if (x > 0 && y < 0) {
			System.out.println("Q4");
		} else if (x < 0 && y > 0) {
			System.out.println("Q2");
		} else {
			System.out.println("Q4");
		}
		
		sc.close();

	}

}
