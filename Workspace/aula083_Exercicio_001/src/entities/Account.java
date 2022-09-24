package entities;

public class Account {
	
	private int number;
	private String holder;
	private double balance;
	
	public Account() {
	}
	
	public Account(int nunber, String holder) {
		this.number = nunber;
		this.holder = holder;
	}

	public Account(int nunber, String holder, double initialDeposit) {
		this.number = nunber;
		this.holder = holder;
		deposit(initialDeposit);
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public int getNunber() {
		return number;
	}

	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount + 5;
	}
	
	public String toString() {
		return "account "
				+ number
				+ ", Holder: "
				+ holder
				+ ", Balance: $ "
				+ String.format("%.2f", balance);
	}

}
