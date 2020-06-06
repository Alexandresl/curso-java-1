package p1_Estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

/**
 *Fazer um programa que leia o número de um funcionário, seu
 *número de horas trabalhadas, o valor que recebe por hora e
 *calcula o salário desse funcionário. A seguir, mostre o 
 *número e o salário do funcionário, com duas casas decimais
 */

public class Aula28_exercicio4 {
	public static void main(String[] args) {
		int numFuncionario, horasTrabalhadas;
		double valor, salario;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número do funcionário:");
		numFuncionario = sc.nextInt();
		System.out.println("Digite o número de horas trabalhadas:");
		horasTrabalhadas = sc.nextInt();
		System.out.println("Digite o valor que recebe por hora:");
		valor = sc.nextDouble();
		salario = valor * horasTrabalhadas;
		System.out.printf("Número: %d\nSalário: R$ %.2f\n", numFuncionario, salario);
		
		sc.close();
	}
}
