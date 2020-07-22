package s14.Aula124_exemplo1.entities;

public class SavingsAccount extends Account {

	private Double interesdtRate;
	
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interesdtRate) {
		super(number, holder, balance);
		this.interesdtRate = interesdtRate;
	}

	public Double getInteresdtRate() {
		return interesdtRate;
	}

	public void setInteresdtRate(Double interesdtRate) {
		this.interesdtRate = interesdtRate;
	}
	
	public void updateBalance() {
		balance += balance * interesdtRate;
	}
	
}
