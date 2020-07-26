package s14.Aula130_exemplo1.entities;

public class BusinessAccount extends Account {
	
	public Double loanLimit;
	
	public BusinessAccount() {
		super();
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	
	public void loan(Double amount) {
		if (loanLimit >= amount) {
			balance += amount;
		}
	}
	
}