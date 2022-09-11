import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double price = sc.nextDouble();
		double discount = 0; // precisa ser inicializada antes do if
		
		if (price > 100.0) {
			discount = price * 0.1;
		}
		
		System.out.println(discount);
		
		sc.close();

	}

}
