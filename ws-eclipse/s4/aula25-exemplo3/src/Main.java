import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		int b = 6;
		int B = 8;
		int h = 5;
		
		double area = (b + B) / 2 * h;
		
		System.out.printf("A área do trapézio é %.2f", area);

	}

}
