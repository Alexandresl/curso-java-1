package s14.Aula132_exercicio1.entities;

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
		
		if (anualIncome < 20000.0) {
			return anualIncome * 0.15;
		} else {
			return anualIncome * 0.25 - healthExpenditures * 0.5;
		}
		
	}	
	
}
