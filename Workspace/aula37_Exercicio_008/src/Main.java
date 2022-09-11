import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario, imposto = 0;
		
		System.out.print("Digite o salário: ");
		salario = sc.nextDouble();
		
		if (salario > 2000 && salario <= 3000) {
			imposto = (salario - 2000) * 0.08;
		} else if (salario > 3000 && salario <= 4500) {
			imposto = 1000 * 0.08;
			imposto = imposto + (salario - 3000) * 0.18;
		} else if (salario > 4500) {
			imposto = 1000 * 0.08;
			imposto = imposto + 1500 * 0.18;
			imposto = imposto + (salario - 4500) * 0.28;
		}
		
		if (imposto == 0) {
			System.out.println("Isento");
		} else {
			System.out.printf("R$ %.2f%n", imposto);
		}
		
		sc.close();

	}

}
