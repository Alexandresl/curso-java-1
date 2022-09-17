import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			
			if (n2 == 0) {
				System.out.println("divisao impossivel");
			} else {
				double result = (double) n1 / n2;
				System.out.printf("%.1f%n", result);
			}
			
		}
		
		sc.close();

	}

}
