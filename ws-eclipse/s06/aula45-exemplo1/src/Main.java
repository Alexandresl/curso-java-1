import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Fazer um programa que lê números inteiros até
		// até que um zero seja lido. Ao final mostrar
		// a soma dos números lidos.
		
		Scanner sc = new Scanner(System.in);
		int Soma = 0;
		System.out.println("Digite um número inteiro: ");
		int num = sc.nextInt();
		
		while (num != 0) {
			Soma += num;
			System.out.println("Digite outro inteiro: ");
			num = sc.nextInt();
		}
		
		System.out.println(Soma);
		sc.close();

	}

}
