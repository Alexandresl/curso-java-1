package s8.Aula68_exercicio3.entities;

public class Student {
	
	public String name;
	public double note1;
	public double note2;
	public double note3;
	
	public double finalGrade() {
		return note1 + note2 + note3;
	}
	
	public String isApproved() {
		return (finalGrade() >= 60.00) ? "PASS" : "FAILED\nMISSING " + 
				String.format("%.2f", 60 - finalGrade()) + " POINTS";
	}
	
	public String toString() {
		return String.format("%.2f\n", finalGrade()) +
				isApproved();
	}
	
}
