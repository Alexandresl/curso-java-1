import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Fazer um programa para ler três números inteiros
		 * e mostrar na tela o maior deles.
		 * 
		 * Exemplo:
		 * Enter three numbers:
		 * 5
		 * 8
		 * 3
		 * Higher = 8
		 */
		
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
		int max;
		if (a > b && a > c) {
			max = a;
		} else if (b > c) {
			max = b;
		} else {
			max = c;
		}
		return max;
	}
	
	public static void showResult(int higher) {
		System.out.println("Higher = " + higher);
	}

}
