import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Fazer um programa que leia o número de um funcionário, seu número de
		 * horas trabalhadas, o valor que recebe por hora e calcula o salário
		 * desse funcionário. A seguir, mostre o número e o salário do
		 * funcionário, com duas casas decimais
		 * */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int numFuncionario, numHorasTrabalhadas;
		double valorPorHora, salario;
		
		System.out.print("Digite o número do funcionário: ");
		numFuncionario = sc.nextInt();
		System.out.print("Digite o número de horas trabalhadas: ");
		numHorasTrabalhadas = sc.nextInt();
		System.out.print("Digite o valor por hora: ");
		valorPorHora = sc.nextDouble();
		
		salario = numHorasTrabalhadas * valorPorHora;
		
		System.out.printf("O número do funcionário é %d\nSeu salário é $ %.2f", numFuncionario, salario);
		
		sc.close();

	}

}
