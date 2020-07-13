package s06;

import java.util.Scanner;

/**
 * Escreva um programa para ler as coordenadas (X, Y)
 * de uma quantidade indeterminada de pontos no sistema
 * cartesiano. Para cada ponto escrever o quadrante a que
 * ele pertence. O algoritmo será encerrado quando pelo
 * menos uma das duas coordenadas for NULA (nesta situação
 * sem escrever mensagem alguma)
 */

public class Aula47_exercicio2 {
	
	public static void main(String[] args) {
	
		int x, y;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite as coordenadas x e y:");
		x = sc.nextInt();
		y = sc.nextInt();
		
		while (x != 0 && y != 0) {
			
			if (x > 0 && y > 0) {
				System.out.println("Primeiro");
			} else if (x < 0 && y > 0) {
				System.out.println("Segundo");
			} else if (x < 0 && y < 0) {
				System.out.println("Terceiro");
			} else {
				System.out.println("Quarto");
			}
			
			System.out.println("Digite as coordenadas x e y:");
			x = sc.nextInt();
			y = sc.nextInt();
			
		}
		
		sc.close();
	}
	
}
