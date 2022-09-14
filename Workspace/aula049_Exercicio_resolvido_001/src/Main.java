import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		while (x != y) {
			
			if (x > y) {
				System.out.println("Decrescente");
			} else {
				System.out.println("Crescente");
			}
			
			x = sc.nextInt();
			y = sc.nextInt();
			
		}
		
		sc.close();

	}

}
