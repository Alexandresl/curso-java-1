package s8.Aula68_exercicio2.aplication;

import java.util.Locale;
import java.util.Scanner;

import s8.Aula68_exercicio2.entities.Employee;

/**
 * Fazer um programa para ler os dados de um funcionário (nome,
 * salário bruto e importo). Em seguida, mostrar os dados do 
 * funcionário (nome e salário líquido). Em seguida, aumentar o 
 * salário do funcionário com base em uma porcentagem dada
 * (som ente o salário bruto é afetado pela porcentagem) e
 * mostrar novamente os dados do funcionário. Use a classe
 * projetada abaixo.
 */

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee empregado = new Employee();
		
		System.out.print("Name: ");
		empregado.name = sc.nextLine();
		System.out.print("Gross salary: ");
		empregado.grossSalary = sc.nextDouble();
		System.out.print("TAX: ");
		empregado.tax = sc.nextDouble();
		
		System.out.println("");
		System.out.println(empregado);
		
		System.out.print("Which percentage to increase salary? ");
		empregado.increaseSalary(sc.nextDouble());
		
		System.out.println("");
		System.out.println(empregado);

		sc.close();
	}

}
