import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Fazer um programa para ler um número N. Depois leia N pares de números
		 * e mostre a divisão do primeiro pelo segundo. Se o denominador for
		 * igual a zero, mostrar a mensagem "Divisãso impossível".
		 * 
		 * Exemplo:
		 * Entrada	|	Saída
		 * 3		|	-1.5
		 * 3 -2		|	Divisão impossível
		 * -8 0		|	0.0
		 * 0 8		|
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			int numerador = sc.nextInt();
			int denominador = sc.nextInt();
			
			if (denominador == 0) {
				System.out.println("Divisão impossível");
			} else {
				double diferenca = (double) numerador / denominador;
				System.out.printf("%.1f\n", diferenca);
			}
		}
		
		sc.close();

	}

}
