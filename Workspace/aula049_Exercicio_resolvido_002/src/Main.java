import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int idade, contador = 0, acumulador = 0;
		
		idade = sc.nextInt();
		
		if (idade >= 0) {
			
			while (idade >= 0) {
				
				contador++;
				acumulador += idade;
				
				idade = sc.nextInt();
				
			}
			
			System.out.printf("%.2f%n", (double) acumulador / contador);
			
		} else {
			System.out.println("impossível calcular");
		}
		
		
		sc.close();

	}

}
