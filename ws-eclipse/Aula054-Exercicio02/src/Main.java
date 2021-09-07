import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Leia um valor inteiro n. Este valor será a quantidade de valores inteiros
		 * x que serão lidos em seguida. Mostre quantos destes valores x estão dentro
		 * do intervalor [10, 20] e quantos estão fora do intervalor, mostrando estas
		 * informações conforme exemplo (use a palavra "in" para dentro do intervalor
		 * e "out" para fora do intervalor).
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int in = 0;
		int out = 0;
		
		for (int i = 1; i <= n; i++) {
			int x = sc.nextInt();
			if (x >= 10 &&  x <= 20) {
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
