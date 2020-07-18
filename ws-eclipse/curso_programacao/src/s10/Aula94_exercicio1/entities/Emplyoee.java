package s10.Aula94_exercicio1.entities;

public class Emplyoee {

	private Integer id;
	private String name;
	private Double salary;
	
	public Emplyoee(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void increaseSalary(double percentage) {
		salary += salary * percentage / 100;
	}
	
	public String toString() {
		return id + ", " + name + ", " + String.format("%.2f", salary);
	}
	
}
