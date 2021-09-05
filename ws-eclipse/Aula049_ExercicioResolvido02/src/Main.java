import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Faça um programa para ler um número indeterminado de dados, contendo
		 * cada um, a idade de um indivíduo. O último dado, que não entrará nos
		 * cálculos, contém um valor de idade negativa. Calcular e imprimir a
		 * idade média deste grupo de indivíduos. Se for entrado um valor 
		 * negativo na primeira vez, mostrar a mensagem "Impossível Calcular".
		 * 
		 *  Entrada	|	Saída
		 *  31		|	34.67
		 *  27		|
		 *  46		|
		 *  -5
		 *  
		 *  Entrada	|	Saída
		 *  -10		|	Impossível Calcular
		 */
		
		Scanner sc = new Scanner(System.in);
		int idade, contador, soma;
		double media;
		
		contador = 0;
		soma = 0;
		idade = sc.nextInt();
		
		if (idade >= 0) {
			while (idade >= 0) {
				contador += 1;
				soma += idade;
				idade = sc.nextInt();
			}
			media = (double) soma / contador;
			System.out.printf("%.2f\n", media);
		} else {
			System.out.println("Impossível Calcular");
		}
		
		sc.close();
	}

}
