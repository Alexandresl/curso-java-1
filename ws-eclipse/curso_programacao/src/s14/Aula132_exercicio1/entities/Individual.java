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
		
		double basicTax;
		
		if (anualIncome < 20000.0) {
			basicTax = anualIncome * 0.15;
		} else {
			basicTax = anualIncome * 0.25;
		}
		
		basicTax = basicTax - healthExpenditures * 0.5;
		
		if (basicTax < 0.0) {
			basicTax = 0.0;
		}
		
		return basicTax;
		
	}	
	
}
