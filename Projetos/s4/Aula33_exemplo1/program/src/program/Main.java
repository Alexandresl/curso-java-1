package program;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int hora;
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantas horas?");
		hora = sc.nextInt();

		if (hora < 12) {
			System.out.print("Bom dia");
		} else if (hora >= 12 && hora < 18) {
			System.out.println("Boa tarde");
		} else {
			System.out.println("Boa noite");
		}

		sc.close();

	}

}
