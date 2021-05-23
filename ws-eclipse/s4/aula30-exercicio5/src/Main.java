import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o código, a quantidade e o valor da peça 1:");
		int cod1 = sc.nextInt();
		int qtd1 = sc.nextInt();
		double valor1 = sc.nextDouble();
		double total1 = qtd1 * valor1;
		System.out.println("Digite o código, a quantidade e o valor da peça 2:");
		int cod2 = sc.nextInt();
		int qtd2 = sc.nextInt();
		double valor2 = sc.nextDouble();
		double total2 = qtd2 * valor2;
		System.out.println("Peça código " + cod1);
		System.out.printf("Valor a pagar %.2f\n", total1);
		System.out.println("Peça código " + cod2);
		System.out.printf("Valor a pagar %.2f\n", total2);
		double valorPagar = total1 + total2; 
		System.out.printf("Total a pagar %.2f\n", valorPagar);
		sc.close();

	}

}
