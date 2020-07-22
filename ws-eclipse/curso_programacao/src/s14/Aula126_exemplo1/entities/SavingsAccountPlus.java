package s14.Aula126_exemplo1.entities;

public class SavingsAccountPlus extends SavingsAccount {

	@Override
	public void withdraw(Double amount) {
		balance -= amount + 2;
	}
	
}
