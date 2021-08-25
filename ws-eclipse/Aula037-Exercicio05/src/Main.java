import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Com base na tabela abaixo, escreva um programa que leia o código de
		 * um item e a quantidade deste item. A seguir, calcule o valor da
		 * conta a pagar
		 * 
		 * |	'Código	|	Especificação	|	Preço		|
		 * |------------|-------------------|---------------|
		 * |	1		|	Cachorro Quente	|	R$	4.00	|
		 * |	2		|	X-Salada		|	R$	4.50	|
		 * |	3		|	X-Bacon			|	R$	5.00	|
		 * |	4		|	Torrada			|	R$	2.00	|
		 * |	5		|	Refrigerante	|	R$	1.50	|
		 * |------------|-------------------|---------------|
		 */
		
		Scanner sc = new Scanner(System.in);
		int item, qtd;
		double vlrConta = 0;
		
		System.out.print("Digite o código do produto: ");
		item = sc.nextInt();
		System.out.print("Digite a quantidade do produto: ");
		qtd = sc.nextInt();
		
		if (item == 1) {
			vlrConta = 4.0 * qtd;
		} else if (item == 2) {
			vlrConta = 4.5 * qtd;
		} else if (item == 3) {
			vlrConta = 5.0 * qtd;
		} else if (item == 4) {
			vlrConta = 2.0 * qtd;
		} else if (item == 5) {
			vlrConta = 1.5 * qtd;
		} else {
			System.out.println("Código inválido.");
		}
		
		System.out.printf("O valor da conta é: R$ %.2f\n", vlrConta);
		
		sc.close();

	}

}
