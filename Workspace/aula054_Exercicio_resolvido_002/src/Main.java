import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, maior, menor, soma;
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		soma = 0;
		
		if (num1 > num2) {
			maior = num1;
			menor = num2;
		} else {
			menor = num1;
			maior = num2;
		}
		
		for (int i = menor + 1; i < maior; i++ ) {
			
			if (i % 2 != 0) {
				
				soma += i;
				
			}
			
		}
		
		System.out.println(soma);
		
		sc.close();
		
	}

}
