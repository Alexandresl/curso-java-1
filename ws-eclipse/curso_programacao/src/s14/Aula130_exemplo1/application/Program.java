package s14.Aula130_exemplo1.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import s14.Aula130_exemplo1.entities.Account;
import s14.Aula130_exemplo1.entities.BusinessAccount;
import s14.Aula130_exemplo1.entities.SavingsAccount;

/**
 * Suponha que em um negócio relacionado a banco, apenas
 * contas poupança e contas para empresas são permitidas.
 * Não existe conta comum.
 * 
 * Para garantir que contas comunns não possam ser
 * instanciadas, basta acrecentarmos a palavra
 * "abstract" na declaração da classe.
 */

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		List<Account> list = new ArrayList<>();
		
		list.add(new SavingsAccount(1001,  "Alex", 500.00, 0.01));
		list.add(new BusinessAccount(1002, "Maria", 1000.00, 400.0));
		list.add(new SavingsAccount(1004, "Bob", 300.0, 0.01));
		list.add(new BusinessAccount(1005, "Anna", 500.0, 500.0));
		
		double sum = 0.0;
		
		for (Account acc : list) {
			sum += acc.getBalance();
		}
		
		System.out.printf("Total Balance: %.2f\n", sum);
		
		for (Account acc : list) {
			acc.deposit(10.0);
		}
		
		for (Account acc : list) {
			System.out.printf("Updated balance for account %d: %.2f\n", acc.getNumber(), acc.getBalance());
		}

	}

}
