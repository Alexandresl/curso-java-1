import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Para ler um caractere
		Scanner sc = new Scanner(System.in);
		char x;
		x = sc.next().charAt(0);
		
		System.out.println(x);
		
		sc.close();

	}

}
