import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um inteiro: ");
		int num1 = sc.nextInt();
		System.out.print("Digite outro inteiro: ");
		int num2 = sc.nextInt();
		int soma = num1 + num2;
		System.out.printf("A soma de %d e %d é %d", num1, num2, soma);
		sc.close();

	}

}
