import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Para ler um número inteiro
		Scanner sc = new Scanner(System.in);
		
		int x;
		x = sc.nextInt();
		
		System.out.println("Você digitou: " + x);
		
		sc.close();

	}

}
