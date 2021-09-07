import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * Leia um valor inteiro x (1 <= x <= 1000). Em seguida mostre os ímpares de 1
		 * até x, uma valor po linha, inclusive x, se for o caso.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		for (int i = 1; i <= x; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		sc.close();

	}

}
