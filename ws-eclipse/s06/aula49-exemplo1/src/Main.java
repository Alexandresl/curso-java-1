import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Leia uma quantidade indeterminada de duplas de valores inteiros x e y.
		// Escreva para cada x e y uma mensagem que indique se estes valores foram
		// digitado em orde crescente ou decrescente. A leitura deve ser encerrada
		// ao ser fornecido valores iguais para x e y.
		
		Scanner sc = new Scanner(System.in);
		int x, y;
		System.out.println("Digite dois valores inteiros:");
		x = sc.nextInt();
		y = sc.nextInt();
		
		while (x != y) {
			if (x < y) {
				System.out.println("Crescente");
			} else {
				System.out.println("Decrescente");
			}
			
			System.out.println("Digite outros dois valores:");
			x = sc.nextInt();
			y = sc.nextInt();
		}
		
		sc.close();

	}

}
