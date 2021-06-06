import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Fazer um programa para ler um número inteiro e dizer
		// se este número é par ou impar.

		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um número inteiro: ");
		int num = sc.nextInt();
		
		if (num % 2 == 0) {
			System.out.printf("O número %d é par.", num);
		} else {
			System.out.printf("O número %d é ímpar", num);
		}
		
	}

}
