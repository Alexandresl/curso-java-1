package s06;

import java.util.Scanner;

/**
 * Leia um valor inteiro N. Este valor será a quantidade
 * de valores inteiros X que serão lidos em seguida.
 * Mostre quantos destes valores X estão dentro do
 * intervalo [10,20] e quantos estão fora do intervalo,
 * mostrando essas informações conforme exemplo (use a
 * palavra "in" para dentro do intervalo, e "out" para
 * fora do intervalo).
 */

public class Aula52_exe2 {

	public static void main(String[] args) {
		
		int n, x, out = 0, in = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de números a ser lidos:");
		n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.printf("Digite %d de %d:\n", i, n);
			x = sc.nextInt();
			
			if (x >= 10 && x <= 20) {
				in++;
			} else {
				out++;
			}
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		sc.close();

	}

}
