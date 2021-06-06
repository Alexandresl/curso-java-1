import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Com base na tabela abaixo, escreva um programa que leia o
		// código de um item e a quantidade deste item. A seguir,
		// calcule e mostre o valor da conta a pagar.
		double total = 0.0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o código do produto\n"
				+ "1 - Cachorro Quente - R$ 4.00\n"
				+ "2 - X-Salada - R$ 4.50\n"
				+ "3 - X-Bacon - R$ 5.00\n"
				+ "4 - Torrada Simples - R$ 2.00\n"
				+ "5 - Refrigerante - R$ 1.50");
		int cod = sc.nextInt();
		System.out.print("Digite a quantidade do produto: ");
		int qtd = sc.nextInt();
		switch(cod) {
			case 1:
				total = 4.00 * qtd;
				break;
			case 2:
				total = 4.50 * qtd;
				break;
			case 3:
				total = 5.00 * qtd;
				break;
			case 4:
				total = 2.00 * qtd;
				break;
			case 5:
				total = 1.50 * qtd;
				break;
		}
		
		System.out.printf("O total a pagar é: R$ %.2f", total);
		
		sc.close();

	}

}
