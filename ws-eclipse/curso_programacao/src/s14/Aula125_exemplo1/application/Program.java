package s14.Aula125_exemplo1.application;

import s14.Aula125_exemplo1.entities.SavingsAccount;
import s14.Aula125_exemplo1.entities.Account;
import s14.Aula125_exemplo1.entities.BusinessAccount;

public class Program {

	public static void main(String[] args) {
		
		Account acc1 = new Account(1001, "Alex", 1000.00);
		acc1.withdraw(200.0);
		System.out.println(acc1.getBalance());
		
		Account acc2 = new SavingsAccount(1002, "Maria", 1000.00, 0.01);
		acc2.withdraw(200.0);
		System.out.println(acc2.getBalance());
		
		Account acc3 = new BusinessAccount(1003, "Bob", 1000.00, 500.00);
		acc3.withdraw(200.0);
		System.out.println(acc3.getBalance());
		
	}
	
}
