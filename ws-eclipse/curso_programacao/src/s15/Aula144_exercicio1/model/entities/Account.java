package s15.Aula144_exercicio1.model.entities;

import s15.Aula144_exercicio1.model.exception.DomainException;

public class Account {
	
	private Integer number;
	private String holder;
	private Double balance;
	private Double widhdrawLimit;
	
	public Account() {
	}

	public Account(Integer number, String holder, Double balance, Double widhdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.widhdrawLimit = widhdrawLimit;
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

	public Double getBalance() {
		return balance;
	}

	public Double getWidhdrawLimit() {
		return widhdrawLimit;
	}
	
	public void deposit(Double amount) {
		balance += amount;
	}
	
	public void withdraw(Double amount) throws DomainException {
		
		if (amount > widhdrawLimit ) {
			throw new DomainException("The amount exceeds withdraw limit");
		}
		
		if (amount > balance) {
			throw new DomainException("Not enough balance");
		}
		
		balance -= amount;
	}
	
	@Override
	public String toString() {
		return String.format("%.2f", balance);
	}

}
