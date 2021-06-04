import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Você deve fazer um programa que leia um valor qualquer
		// e apresente uma mensagem dizendo em qual dos seguintes
		// intervalos ([0, 25], (25, 50], (50, 75], (75, 100]) este
		// valor se encontra. Obviamente se o valor não estiver em
		// nenhum destes intervalos, deverá ser impressa a mensagem
		// "Fora do intervalor"
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		double num = sc.nextDouble();
		
		if (num >= 0 && num <= 25) {
			System.out.printf("O número %.2f está dentro do intervalo [0, 25]\n", num);
		} else if (num > 25 && num <= 50) {
			System.out.printf("O número %.2f está dentro do intervalo (25, 50]\n", num);
		} else if (num > 50 && num <= 75) {
			System.out.printf("O número %.2f está dentro do intervalo (50, 75]\n", num);
		} else if (num > 75 && num <= 100) {
			System.out.printf("O número %.2f está dentro do intervalo (75, 100]\n", num);
		} else {
			System.out.println("Fora do intervalo");
		}
		
		sc.close();

	}

}
