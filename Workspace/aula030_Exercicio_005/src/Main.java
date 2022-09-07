import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int peca1, peca2, qtPeca1, qtPeca2;
		double valorPeca1, valorPeca2, total;
		
		System.out.println("Digite o código, quantidade e valor da peça 1:");
		peca1 = sc.nextInt();
		qtPeca1 = sc.nextInt();
		valorPeca1 = sc.nextDouble();
		
		System.out.println("Digite o código, quantidade e valor da peça 2:");
		peca2 = sc.nextInt();
		qtPeca2 = sc.nextInt();
		valorPeca2 = sc.nextDouble();
		
		total = qtPeca1 * valorPeca1 + qtPeca2 * valorPeca2;
		
		System.out.println("C0MPRA: PEÇA CÓDIGO " + peca1 + " + PEÇA CÓDIGO " + peca2);
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
		
		sc.close();

	}

}
