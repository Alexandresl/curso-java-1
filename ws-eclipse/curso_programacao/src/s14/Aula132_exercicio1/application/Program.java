package s14.Aula132_exercicio1.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import s14.Aula132_exercicio1.entities.Individual;
import s14.Aula132_exercicio1.entities.TaxPayer;
import s14.Aula132_exercicio1.entities.company;

/**
 * Fazer um programa para ler os dados de N contribuintes (N fornecido pelo usuário), os quais
 * podem ser pessoa física ou pessoa juridica, e depois mostrar o valor do imposto pago por
 * cada um, bem como o total de imposto arrecadado.
 * 
 * Os dados de pessoa física são: nome, renda anual e gastos com saúde. Os dados de pessoa jurídica
 * são nome, renda anual e número de funcionários. As regras para cálculo de imposto são as
 * seguintes:
 * 
 * Pessoa física: pessoas cuja renda foi abaixo de 20,000.00 pagam 15% de imposto. Pessoas com
 * renda de 20,000.00 em diante pagam 25% de importo. Se a pessoa teve gasot dom saúde, 50%
 * destes gastos são abatidos no imposto.
 * Exemplo: uma pessoa cuja renda foi 50,000.00 e teve 2000.00 em gastos com saúde, o imposto
 * fica: (50000 * 25%) - (2000 * 50%) = 11500.00
 * 
 * Pessoa jurídica: pessoa jurídicas pagam 16% de imposto. Porém, se a empresa possuir mais de 10
 * funcionários, ela paga 14% de imposto.
 * Exemplo: uma empresa cuja renda foi 400,000,00 e possui 25 funcionários, o imposto fica:
 * 400000 * 14% = 56000.00
 */

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		List<TaxPayer> list = new ArrayList<>();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char p = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Anual income: ");
			Double anualIncome = sc.nextDouble();
			
			if (p == 'i') {
				System.out.print("Health expenditures: ");
				Double healthExpenditures = sc.nextDouble();
				
				list.add(new Individual(name, anualIncome, healthExpenditures));
				
			} else {
				System.out.print("Number of employees: ");
				Integer numberEmployees = sc.nextInt();
				
				list.add(new company(name, anualIncome, numberEmployees));
				
			}
			
		}
		
		double totalTaxes = 0.0;
		
		System.out.println();
		System.out.println("TAXES PAID:");
		for (TaxPayer p : list) {
			System.out.println(p);
			totalTaxes += p.tax();
		}
		
		System.out.println();
		System.out.printf("TOTAL TAXES: $ %.2f", totalTaxes);
		
		sc.close();
		
	}
	
}
