package s10.Aula89_exercicio1.application;

import java.util.Scanner;

import s10.Aula89_exercicio1.entities.Rent;

/**
 * A dona de um pensionato possui dez quartos para alugar
 * para estudantes, sendo esses qurtos identificados pelos
 * n�meros 0 a 9.
 * 
 * Fazer um programa que inicie com todos os dez quartos
 * vazios, e depois leia uma quantidade N representando
 * o n�mero de estudantes que v�o alugar quartos (N pode
 * ser de 1 a 10). Em seguida, registre o aluguel dos N
 * estudantes. Para cada registro de aluguel, informar o
 * nome e email do estudante, bem como qual dos quartos
 * ele escolheu (de 0 a 9). Suponha que seja escolhido
 * um quarto vago. Ao final, seu programa deve imprimir
 * um relat�rio de todas ocupa��es do pensionato, por 
 * ordem de quarto, conforme exemplo. 
 */

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Rent[] vect = new Rent[10];
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("\nRent #" + i);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			vect[room] = new Rent(name, email);
		}
		
		System.out.println("\nBusy rooms:");
		
		for (int i = 0; i < 10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}
		
		sc.close();

	}

}