import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		
		System.out.println("Digite um inteiro de um a dez:");
		x = sc.nextInt();
		System.out.println("O número digitado foi: " + x);
		
		sc.close();

	}

}
