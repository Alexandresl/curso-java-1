package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();
		
		String[] vectName = new String[n];
		int[] vectAge = new int[n];
		
		for (int i = 0; i < vectName.length; i++) {
			sc.nextLine();
			System.out.println("Dados da " + (i + 1) + "a pessoa:");
			System.out.print("Nome: ");
			vectName[i] = sc.nextLine();
			System.out.print("Idade: ");
			vectAge[i] = sc.nextInt();
		}
		
		int majorAge = vectAge[0];
		int indice = 0;
		
		for (int i = 0; i < vectAge.length; i++) {
			
			if (vectAge[i] > majorAge) {
				majorAge = vectAge[i];
				indice = i;
			}
			
		}
		
		System.out.println("PESSOA MAIS VELHA: " + vectName[indice]);
		
		sc.close();

	}

}
