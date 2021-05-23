import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
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
