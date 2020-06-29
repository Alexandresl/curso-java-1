package s4;

import java.util.Locale;
import java.util.Scanner;

public class Aula24_exe3 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double x;
		x = sc.nextDouble();
		System.out.println("Você digitou: " + x);
		sc.close();
	}
}
