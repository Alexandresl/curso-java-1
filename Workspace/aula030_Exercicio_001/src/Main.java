import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n1, n2, sum;
		
		System.out.print("Digite o primeiro inteiro: ");
		n1 = sc.nextInt();
		System.out.print("Digite o próximo inteiro: ");
		n2 = sc.nextInt();
		
		sum = n1 + n2;
		
		System.out.println();
		System.out.println("Soma = " + sum);
		
		sc.close();

	}

}
