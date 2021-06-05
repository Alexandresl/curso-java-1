import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Leia 2 valores inteiros (A e B). Após, o programa deve mostrar
		// uma mensagem "São múltiplos" ou "Não são múltiplos", indicando se
		// os valores lidos são múltiplos entre si. Atenção: os valores devem
		// poder ser digitados em ordem crescente ou decrescente.
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite 2 inteiros:");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		if (n1 < n2) {
			if (n2 % n1 == 0) {
				System.out.printf("%d é múltiplo de %d", n2, n1);
			} else {
				System.out.printf("%d não é múltiplo de %d", n2, n1);
			}
		} else {
			if (n1 % n2 == 0) {
				System.out.printf("%d é múltiplo de %d", n1, n2);
			} else {
				System.out.printf("%d não é múltiplo de %d", n1, n2);
			}
		}
		
		sc .close();

	}

}
