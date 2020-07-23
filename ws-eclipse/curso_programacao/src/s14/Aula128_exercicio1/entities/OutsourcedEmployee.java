package s14.Aula128_exercicio1.entities;

public class OutsourcedEmployee extends Employee {
	
	private Double additionalCharge;
	
	public OutsourcedEmployee() {
	}
	
	public OutsourcedEmployee(String name, Integer hours, Double valuPerHour, Double additionalCharge) {
		super(name, hours, valuPerHour);
		this.additionalCharge = additionalCharge;
	}

	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	
	@Override
	public Double payment() {
		return valuPerHour * hours + additionalCharge * 1.1;
	}
	
}