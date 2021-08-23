import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Quebra de linha pendente
		Scanner sc = new Scanner(System.in);
		
		int x;
		String s1, s2, s3;
		
		x = sc.nextInt();
		sc.nextLine();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("Dados digitados:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		sc.close();

	}

}
