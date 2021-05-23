import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero, horas;
		double valor, salario;
		
		System.out.print("Digite o número do funcionario: ");
		numero = sc.nextInt();
		System.out.print("Digite o número de horas trabalhadas: ");
		horas = sc.nextInt();
		System.out.print("Digite o valor por hora: ");
		valor = sc.nextDouble();
		salario = valor * horas;
		System.out.printf("O número do funcionario é %d\n", numero);
		System.out.printf("O salário é %.2f\n", salario);
		
		

	}

}
