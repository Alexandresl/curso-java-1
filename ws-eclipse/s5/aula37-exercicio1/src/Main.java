import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Fazer um programa para ler um número inteiro, e depois
		// dizer se este número é negativo ou não
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int num = sc.nextInt();
		
		if (num < 0) {
			System.out.println("Número negativo.");
		} else {
			System.out.println("Número não negativo.");
		}
		
		sc.close();

	}

}
