package s14.Aula124_exemplo1.application;

import s14.Aula124_exemplo1.entities.Account;
import s14.Aula124_exemplo1.entities.BusinessAccount;
import s14.Aula124_exemplo1.entities.SavingsAccount;

/**
 * Suponha um negócio de banco que possui uma conta comum e uma conta
 * para empresas, sendo que a conta para empresa possui todos membros
 * da conta comum, mais um limite de empréstimo e uma operação de 
 * realizar o empréstimo
 */

public class Program {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "maria", 0.0, 500.0);
		
		//UPCASTING
		@SuppressWarnings("unused")
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
		
		//DOWNCASTING
		BusinessAccount acc4 = (BusinessAccount) acc2;
		acc4.loan(100.0);
		
		// BusinessAccount acc5 = (BusinessAccount) acc3; // Gera erro em tempo de execução
		
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount) acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount) acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
		
	}

}