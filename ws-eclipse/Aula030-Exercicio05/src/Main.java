import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Fazer um programa para ler o código de uma peça 1, o número de peças
		 * 1, o valor unitário de cada peça 1, o código de uma peça 2, o número
		 * de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o
		 * valor a ser pago.
		 * */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int cod1, cod2, numPeca1, numPeca2;
		double vlrPeca1, vlrPeca2, total;
		
		System.out.print("Digite o código, a quantidade e o valor unitário de cada peça: ");
		cod1 = sc.nextInt();
		numPeca1 = sc.nextInt();
		vlrPeca1 = sc.nextDouble();
		cod2 = sc.nextInt();
		numPeca2 = sc.nextInt();
		vlrPeca2 = sc.nextDouble();
		
		total = numPeca1 * vlrPeca1 + numPeca2 * vlrPeca2;
		
		System.out.printf("O total a pagar é $ %.2f das peças de códigos %d e %d.", total, cod1, cod2);
		sc.close();
	}

}
