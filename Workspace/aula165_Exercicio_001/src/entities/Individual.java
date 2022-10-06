package entities;

public class Individual extends TaxPayer {
	
	private Double healthExpenditures;
	
	public Individual() {
		super();
	}

	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public Double tax() {
		
		Double taxValue = 
				(getAnualIncome() < 20000.00) 
				? getAnualIncome() * 0.15 - healthExpenditures * 0.5 
				: getAnualIncome() * 0.25 - healthExpenditures * 0.5;
		
		return taxValue;
	}

}
