import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char x;
		
		System.out.println("Digite M ou F:");
		x  = sc.next().charAt(0);
		System.out.println("Seu sexo é " + x);
		
		sc.close();

	}

}
