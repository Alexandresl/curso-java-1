package s14.Aula132_exercicio1.entities;

public class company extends TaxPayer{

	private Integer numberEmployees;

	public company() {
		super();
	}

	public company(String name, Double anualIncome, Integer numberEmployees) {
		super(name, anualIncome);
		this.numberEmployees = numberEmployees;
	}

	public Integer getNumberEmployees() {
		return numberEmployees;
	}

	public void setNumberEmployees(Integer numberEmployees) {
		this.numberEmployees = numberEmployees;
	}

	@Override
	public Double tax() {
		
		if (numberEmployees <= 10) {
			return anualIncome * 0.16;
		} else {
			return anualIncome * 0.14;
		}
	}
	
}
