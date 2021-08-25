import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Leia a hora inicial e a hora final de um jogo. A seguir calcule a 
		 * duração do jogo, sabendo que o mesmo pode começar em um dia e
		 * terminar em outro, tendo uma duração de 1 hora e máxima de 24
		 * horas.
		 */
		
		Scanner sc = new Scanner(System.in);
		int hInicial, hFinal;
		
		System.out.print("Digite a hora inicial e final do jogo: ");
		hInicial = sc.nextInt();
		hFinal = sc.nextInt();
		
		if (hInicial < hFinal) {
			System.out.printf("O jogo durou %d hora(s)", hFinal - hInicial);
		} else {
			System.out.printf("O jogo durou %d hora(s)", (24 - hInicial) + hFinal);
		}
		
		sc.close();

	}

}
