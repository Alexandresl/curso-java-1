import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.println("Digite 3 números inteiros:");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		if (num1 < num2 && num1 < num3) {
			System.out.println("MENOR = " + num1);
		} else if (num2 < num3) {
			System.out.println("MENOR = " + num2);
		} else {
			System.out.println("MENOR = " + num3);
		}
				
		sc.close();

	}

}
