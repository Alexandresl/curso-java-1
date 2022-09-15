import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n, x, soma;
		
		n = sc.nextInt();
		soma = 0;
		x = 0;
		
		for (int i = 0; i < n; i++) {
			
			x = sc.nextInt();
			
			soma += x;
			
		}
		
		System.out.println(soma);
		
		sc.close();

	}

}
