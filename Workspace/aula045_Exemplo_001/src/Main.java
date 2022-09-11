import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num, soma;
		
		System.out.print("Digite um número: ");
		num = sc.nextInt();
		
		soma = 0;
		
		while (num != 0) {
			
			soma += num;
			
			System.out.print("Digite outro número: ");
			num = sc.nextInt();
			
			
		}
		
		System.out.println(soma);
		
		sc.close();

	}

}
