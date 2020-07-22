package s14.Aula124_exemplo1.entities;

public class Account {

	protected Integer number;
	protected String holder;
	protected Double balance;
	
	public Account() {
	}

	public Account(Integer number, String holder, Double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}
	
	public void withdraw(Double amount) {
		balance += amount;
	}
	
	public void deposit(Double amount) {
		if (balance >= amount) {
			balance -= amount;
		}
	}
	
}
