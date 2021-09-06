import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * URI 1078
		 * 
		 * Leia 1 valor inteiro N (2 < N < 1000). A seguir, mostre a tabuada de N
		 * 1 * N = N	
		 * 2 * N = 2N 
		 * ... 
		 * 10 * N = 10N
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " X " + n + " = " + (n * i));
		}
		
		sc.close();

	}

}
