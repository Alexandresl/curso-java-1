import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Fazer um programa para ler um número inteiro e dizer se este número é
		 * par ou ímpar
		 */
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.print("Digite um inteiro: ");
		num = sc.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("Número par");
		} else {
			System.out.println("Número ímpar");
		}
		
		sc.close();

	}

}
