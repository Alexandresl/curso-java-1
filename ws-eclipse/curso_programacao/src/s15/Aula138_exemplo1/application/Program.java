package s15.Aula138_exemplo1.application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		method1();
		
		System.out.println("End of Program");

	}
	
	public static void method1() {
		
		System.out.println("***Method1 START");
		
		method2();
		
		System.out.println("***Method1 END");
		
	}

	public static void method2() {
		
		System.out.println("***Method2 START");
		
		Scanner sc = new Scanner(System.in);

		try {

			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position!");
			e.printStackTrace();
			sc.next();
		} catch (InputMismatchException e) {
			System.out.println("Input error");
		}

		sc.close();
		
		System.out.println("***Method2 END");

	}

}
