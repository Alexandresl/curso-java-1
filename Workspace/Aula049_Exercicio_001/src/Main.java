import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int senha = 2002;
		int num = sc.nextInt();
		
		while (senha != num) {
			
			System.out.println("Senha Invalida");
			
			num = sc.nextInt();
			
		}
		
		System.out.println("Acesso Permitido");
		
		sc.close();

	}

}
