package s09.Aula80_exemplo1.application;

import java.util.Locale;
import java.util.Scanner;

import s09.Aula80_exemplo1.entities.Conta;

/**
 * Em um banco, para se cadastrar em uma conta banc�ria, 
 * � necess�rio informar o n�mero da conta, o nome do 
 * titular da conta, e o valor de dep�sito inicial que
 * o titular depositou ao abrir a conta. Este valor de
 * dep�sito inicial, entretanto, � opcional, ou seja:
 * se o titular n�o tiver dinheiro a depoisitar no 
 * momento de abrir sua conta, o dep�sito inicial n�o
 * ser� feito e o saldo inicial da conta ser�, naturalmente,
 * zero.
 * 
 * Importante: uma vez que uma conta banc�ria foi aberta,
 * o n�mero da conta nunca poder� ser alterado. J� o nome
 * do titular pode ser alterado (pois uma pessoa pode mudar
 * de nome por ocasi�o de casamento, por exemplo).
 * 
 * Por fim, o saldo da conta n�o pode ser alterado livremente.
 * � preciso haver um mecanismo para proteger isso. O saldo s�
 * aumenta por meio de dep�sitos, e s� diminui por meio de saques.
 * Para cada saque realizado, o banco cobra uma taxa de $ 5.00.
 * Nota: A conta pode ficar com saldo negativo se o saldo n�o
 * for suficiente para realizar o saque e/ou pagar a taxa.
 * 
 * Voc� deve fazer um programa que realize o cadastro de uma
 * conta, dando op��o para que seja ou n�o informado o valor
 * de dep�sito inicial. Em seguida, realizar um dep�sito e 
 * depois um saque, sempre mostrando os dados da conta ap�s 
 * cada opera��o.
 */

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String hold = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)? ");
		char option = sc.next().charAt(0);
		
		if (option == 'y') {
			System.out.print("Enter initial deposit value: ");
			double value = sc.nextDouble();
			conta = new Conta(number, hold, value);
		} else {
			conta = new Conta(number, hold);
		}
		
		System.out.println("\nAccount data:");
		System.out.println(conta.toString());
		
		System.out.print("\nEnter a deposit value: ");
		conta.deposito(sc.nextDouble());
		
		System.out.println("Updated account data:");
		System.out.println(conta.toString());
		
		System.out.print("\nEnter a withdraw value: ");
		conta.saque(sc.nextDouble());
		
		System.out.println("Updated account data:");
		System.out.println(conta.toString());
		
		sc.close();
		
	}

}