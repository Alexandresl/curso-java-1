package s14.Aula130_exemplo1.entities;

public class SavingsAccount extends Account {

	public double interestRate;

	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateValance() {
		balance += balance * interestRate;
	}
	
}
