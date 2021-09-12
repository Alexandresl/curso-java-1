package entities;

public class Account {
	
	private int number;
	private String Holder;
	private double balance;
	
	public Account(int number, String holder, double balance) {
		this.number = number;
		Holder = holder;
		this.balance = balance;
	}
	public Account(int number, String holder) {
		this.number = number;
		Holder = holder;
	}
	
	public int getNumber() {
		return number;
	}
	public double getBalance() {
		return balance;
	}
	public String getHolder() {
		return Holder;
	}
	public void setHolder(String holder) {
		Holder = holder;
	}
	
	public void deposit(double value) {
		balance += value;
	}
	
	public void withdraw(double value) {
		balance -= (value + 5.00);
	}
	
	public String toString() {
		return "Account " + number + ", Holder: " +
				Holder + ", Balance: $ " + String.format("%.2f", balance);
	}

}
