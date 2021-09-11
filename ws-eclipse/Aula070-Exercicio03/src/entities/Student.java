package entities;

public class Student {
	
	public String name;
	public double grade1;
	public double grade2;
	public double grade3;
	
	public double finalGrade() {
		return grade1 + grade2 + grade3;
	}
	
	public double missingPoints() {
		return 60.00 - finalGrade();
	}
	
	public String isApproved() {
		String result = "";
		if (finalGrade() < 60.0) {
			result = "FAILED\n"
					+ "MISSING " + String.format("%.2f", missingPoints()) + " POINTS";
		} else {
			result = "PASS\n";
			
		}
		return result;
	}

}
