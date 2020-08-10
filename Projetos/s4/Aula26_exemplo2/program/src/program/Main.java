package program;

public class Main {
	public static void main(String[] args) {
		double a, b, c;
		
		a = 1;
		b = -5;
		c = 6;
		
		double delta = Math.pow(b, 2.0) - 4 * a * c;
		System.out.println(Math.sqrt(delta));
		double x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
		double x2 = (-b - Math.sqrt(delta)) / (2.0 * a);
		
		System.out.println("x1 = " + x1);
		System.out.println("x2 = " + x2);
		
	}
}
