package s04;

import java.util.Locale;
import java.util.Scanner;

public class Aula24_exe5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// Declaração de três variáveis
		String x;
		int y;
		double z;
		// São realizadas as leituras em sequência:
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		// São impressos os dados
		System.out.println("Dados digitados:");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

		sc.close();
		
	}

}
