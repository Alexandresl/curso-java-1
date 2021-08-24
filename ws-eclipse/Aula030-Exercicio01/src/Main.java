import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Faça um programa para ler dois valores inteiros e depois mostar na
		 * tela a soma desses números com uma mensagem explicativa, conforme
		 * exemplos.
		 * */
		
		Scanner sc = new Scanner(System.in);
		int x, y;
		
		System.out.print("Digite um inteiro: ");
		x = sc.nextInt();
		System.out.print("Digite outro inteiro: ");
		y = sc.nextInt();
		System.out.println("A soma é: " + (x + y));
		
		sc.close();

	}

}
