import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Fazer um programa para ler um número inteiro positivo N. O programa deve
		 * então mostrar na tela N linhas, começando de 1 até N. Para cada linha
		 * mostrar o número de linhas, depois o quadrado e o cubo do valor,
		 * conforme exemplo
		 * 
		 * Exemplo
		 * Entrada	|	Saída
		 * 5		|	1 1 1
		 * 			|	2 4 8
		 * 			|	3 9 27
		 * 			|	4 16 64
		 * 			|	5 25 125
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.printf("%d %d %d\n", i, i * i, i * i * i);
		}
		
		sc.close();

	}

}
