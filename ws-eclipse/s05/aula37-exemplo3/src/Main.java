import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Fazer um programa para ler três números inteiros. Em seguida,
		// mostrar qual o menor dentre os três números lidos. Em caso de
		// empate, mostrar apenas uma vez.
		
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.println("Digite 3 números inteiros:");
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		if (num1 < num2 && num1 < num3) {
			System.out.println("O menor número é o " + num1);
		} else if (num2 < num3) {
			System.out.println("O menor número é o " + num2);
		} else {
			System.out.println("O menor número é o " + num3);
		}
		
		sc.close();

	}

}
