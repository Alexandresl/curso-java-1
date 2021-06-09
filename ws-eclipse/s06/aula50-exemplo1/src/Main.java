import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Fazer um programa que leia um valor inteiro N e depois N números
		// inteiros. Ao final, mostra a soma dos N números lidos.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o número de números a serem lidos: ");
		int qtd = sc.nextInt();
		int soma = 0;
		
		for (int i = 0; i < qtd; i++) {
			System.out.printf("digite o %d de %d: ", i + 1, qtd);
			soma += sc.nextInt();
		}
		
		if (soma != 0) {
			System.out.println("A soma é: " + soma);
		}
		
		sc.close();

	}

}
