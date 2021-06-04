import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Uma operadora de telefoneia cobra R$ 50.00 por um plano
		// básico que dá direito a 100 minutos de telefone. Cada
		// minuto que exceder a franquia de 100 minutos custa
		// R$ 2.00. Fazer um programa para ler a quantidade de 
		// minutos que uma pessoa consumiu, daí mostrar o valor
		// a ser pago.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a quantidade de minutos utilizados: ");
		int qtdMinutos = sc.nextInt();
		double valor = 50;
		
		if (qtdMinutos > 100) {
			valor += (qtdMinutos - 100) * 2;
		}
		
		System.out.printf("Valor a pagar: R$ %.2f\n", valor);
		
		sc.close();

	}

}
