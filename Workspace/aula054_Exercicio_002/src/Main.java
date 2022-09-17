import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n, x, in, out;
		in = 0;
		out = 0;
		
		n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			
			x = sc.nextInt();
			
			if (x >= 10 && x <= 20) {
				in++;
			} else {
				out++;
			}
			
		}
		
		System.out.println(in + " int");
		System.out.println(out + " out");
		
		sc.close();

	}

}
