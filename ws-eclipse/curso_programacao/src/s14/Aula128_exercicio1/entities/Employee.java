package s14.Aula128_exercicio1.entities;

public class Employee {
	
	protected String name;
	protected Integer hours;
	protected Double valuPerHour;
	
	public Employee() {
	}

	public Employee(String name, Integer hours, Double valuePerHour) {
		this.name = name;
		this.hours = hours;
		this.valuPerHour = valuePerHour;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	public Double getValuPerHour() {
		return valuPerHour;
	}

	public void setValuPerHour(Double valuPerHour) {
		this.valuPerHour = valuPerHour;
	}
	
	public Double payment() {
		return valuPerHour * hours;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(name);
		sb.append(" - $ ");
		sb.append(String.format("%.2f", payment()));
		
		return sb.toString();
	}
	
}
