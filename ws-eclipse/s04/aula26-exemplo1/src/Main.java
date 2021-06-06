import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String x;
		System.out.println("Digite seu primeiro nome:");
		x = sc.next();
		System.out.println("Seu primeiro nome é " + x);
		
		sc.close();

	}

}
