import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		/*
		 * Leia 3 valores de ponto flutuantd e efetue o cálculo das raízes da 
		 * equação de Bhaskara. Se não for possível calcular as raízes, mostre
		 * a mensagem correspondente "impossível calcular", caso haja um divisão
		 * por zero (0) ou raiz de número negativo.
		 * 
		 * Entradas:
		 * Leia três valores de ponto flutuante (double) A, B e C.
		 * 
		 * Saídas:
		 * Se não houver possibilidade de calcular as raízes, apresente a
		 * mensagem "Impossível calcular". Caso contrário, imprima o resultado 
		 * das raízes com 5 dígitos após o ponto, com uma mensagem 
		 * correspondente conforme exemplos. imprima sempre o final de linha
		 * após cada mensagem.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, delta, raiz1, raiz2;
		
		System.out.print("Digite três valores de ponto flutuante: ");
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		delta = Math.pow(B, 2) - (4 * A * C);
		
		if (A != 0 && delta >= 0) {
			
			raiz1 = (-B + Math.sqrt(delta)) / (2 * A);
			raiz2 = (-B - Math.sqrt(delta)) / (2 * A);
			
			System.out.printf("R1 é: %.5f\n", raiz1);
			System.out.printf("R2 é: %.5f\n", raiz2);
			
		} else {
			System.out.println("Impossível calcular");
		}
		
		sc.close();
		
	}
}
