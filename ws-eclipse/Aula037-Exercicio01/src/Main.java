import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Fazer um programa para ler um número inteiro, e depois dizer se este
		 * número é negativo ou não.
		 */
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.print("Digite um número inteiro: ");
		num = sc.nextInt();
		
		if (num < 0) {
			System.out.println("Negativo");
		} else {
			System.out.println("Não Negativo");
		}
		
		sc.close();

	}

}
