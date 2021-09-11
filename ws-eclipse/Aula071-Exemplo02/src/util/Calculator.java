package util;

public class Calculator {
	
	public final double PI = 3.14159;
	
	public double circumference(double radius) {
		return 2 * PI * radius;
	}
	
	public double volume(double radius) {
		return 4 * PI * Math.pow(radius, 3) / 3.0;
	}

}
