import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numFuncionario, horasTrabalhadas;
		double valorPorHora, salario;
		
		System.out.print("Digite o número do funcionario: ");
		numFuncionario = sc.nextInt();
		System.out.print("Digite o número de horas trabalhadas: ");
		horasTrabalhadas = sc.nextInt();
		System.out.print("Digite o valor que recebe por hora: ");
		valorPorHora = sc.nextDouble();
		
		salario = horasTrabalhadas * valorPorHora;
		
		System.out.println();
		System.out.println("NUMBER = " + numFuncionario);
		System.out.printf("SALARIO = U$ %.2f%n", salario);
		
		sc.close();

	}

}
