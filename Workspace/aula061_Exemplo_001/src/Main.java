import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int higher = max(a, b, c);
		
		showResult(higher);
				
		sc.close();

	}

	public static int max(int a, int b, int c) {
		
		int maior = a;
		
		if (maior < b) {
			maior = b;
		}
		
		if (maior < c) {
			maior = c;
		}
		
		return maior;
	}
	
	public static void showResult(int higher) {
		
		System.out.println("Higher = " + higher);
		
	}

}
