package program;

import java.util.Scanner;

/**
 * Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
 * começar em um dia e terminar em outro, trendo uma duração mínima de 1 hora e mázima de 24 horas.
 */

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int horaInicial = sc.nextInt();
		int horaFinal = sc.nextInt();
		int duracao;
		
		if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;	
		} else {
			duracao = (horaFinal + 24) - horaInicial;
		}
		
		System.out.printf("O JOGO DUROU %d HORA(S)", duracao);
		sc.close();

	}

}
