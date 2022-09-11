import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int qtdMinutos;
		double valor = 50.0;
		
		System.out.print("Digite a quantidade de minutos; ");
		qtdMinutos = sc.nextInt();
		
		if (qtdMinutos > 100) {
			valor += (qtdMinutos - 100) * 2.0;
		}
		
		System.out.printf("Valor a pagar: R$ %.2f%n", valor);
		
		sc.close();

	}

}
