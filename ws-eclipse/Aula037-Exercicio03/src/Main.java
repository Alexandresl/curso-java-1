import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma 
		 * mensagem "São múltiplos" ou "Não são múltiplos", indicando se os
		 * os valores lidos são múltiplos entre si. Atenção: os números devem
		 * poder ser digitados em ordem crescente ou decrescente.
		 */
		
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		
		System.out.print("Digite 2 inteiros: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		if (num1 % num2 == 0 || num2 % num1 == 0) {
			System.out.println("São múltiplos");
		} else {
			System.out.println("Não são múltiplos");
		}
		
		sc.close();

	}

}
