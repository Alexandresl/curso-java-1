import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int A, B, C, D;
		System.out.print("Digite 4 números inteiros: ");
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		int resultado = A * B - C * D;
		System.out.printf("(%d * %d) - (%d * %d) = %d", A, B, C, D, resultado);
		sc.close();

	}

}
