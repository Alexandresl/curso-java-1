import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Leia um valor N. Calcular e escrever seu respectivo fatorial. Fatorial
		 * de N = N * (N - 1) * (N - 2) * ... * 1. Lembrando que, por definião,
		 * fatorial de 0 é 1.
		 */
		
		Scanner sc = new Scanner(System.in);
				
		int num = sc.nextInt();
		int fat = 1;
		
		for (int i = 1; i <= num; i++) {
			fat = fat * i;
		}
		
		System.out.println(fat);
		sc.close();

	}

}
