import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Fazer um programa para ler três número inteiros. Em seguida, mostrar
		 * qual o menor dentre os três números lidos. Em caso de empate, mostrar
		 * apenas uma vez.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.print("Digite 3 número inteiros: ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		
		if (n1 < n2 && n1 < n3) {
			System.out.println("O menor número é: " + n1);
		} else if (n2 < n3) {
			System.out.println("O menor número é: " + n2);
		} else {
			System.out.println("O menor número é: " + n3);
		}
				
		sc.close();

	}

}
