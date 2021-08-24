import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Fazer um programa para ler quatro valores inteiros A, B, C e D. A 
		 * seguir, calcule e mostre a diferença do produto de A e B pelo produto
		 * de C e D segundo a fórmula: Diferença = (A * B - C * D).
		 */
		
		Scanner sc = new Scanner(System.in);
		int A, B, C, D, resultado;
		
		System.out.print("Digite quatro valores inteiros: ");
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		resultado = A * B - C * D;
		
		System.out.printf("Retorno de (A * B - C * D) = %d", resultado);
		
		sc.close();

	}

}
