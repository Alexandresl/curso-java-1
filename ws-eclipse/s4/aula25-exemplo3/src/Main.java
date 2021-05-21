import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		double b, B, h, area;
		
		b = 6.0;
		B = 8.0;
		h = 5.0;
		
		area = (b + B) / 2 * h;
		
		System.out.printf("A área do trapézio é %.2f", area);
		// A área do trapézio é 35.00

	}

}
