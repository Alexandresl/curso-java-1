package s14.Aula132_exercicio1.entities;

public abstract class TaxPayer {

	protected String name;
	protected Double anualIncome;
	
	public TaxPayer() {
	}

	public TaxPayer(String name, Double anualIncome) {
		this.name = name;
		this.anualIncome = anualIncome;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnualIncome() {
		return anualIncome;
	}

	public void setAnualIncome(Double anualIncome) {
		this.anualIncome = anualIncome;
	}
	
	public abstract Double tax();
	
	@Override
	public String toString() {
		return name + ": $ " + String.format("%.2f", tax());
	}
	
}
