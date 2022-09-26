package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas: ");
		int n = sc.nextInt();
		
		Person[] vect = new Person[n];
		double minorHeight = 0;
		double majorHeight = 0;
		double sumHeightWoman = 0;
		int genderF = 0;
		int genderM = 0;
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Altura da " + (i + 1) + "a pessoa: ");
			double height = sc.nextDouble();
			System.out.print("Genero da " + (i + 1) + "a pessoa: ");
			char gender = sc.next().charAt(0);
			
			vect[i] = new Person(height, gender);	
		}
		
		for (int i = 0; i < vect.length; i++) {
			
			if (i == 0) {
				minorHeight = vect[i].getHeight();
				majorHeight = vect[i].getHeight();
			} else {
				if (minorHeight > vect[i].getHeight()) {
					minorHeight = vect[i].getHeight();
				}
				if (majorHeight < vect[i].getHeight()) {
					majorHeight = vect[i].getHeight();
				}
			}
			
			if (vect[i].getGender() == 'F') {
				sumHeightWoman += vect[i].getHeight();
				genderF++;
			} else {
				genderM++;
			}
			
		}
		
		double avgHeightWoman = sumHeightWoman / genderF;
		
		System.out.printf("Menor altura = %.2f%n", minorHeight);
		System.out.printf("Maior altura = %.2f%n", majorHeight);
		System.out.printf("Media das alturas das mulheres = %.2f%n", avgHeightWoman);
		System.out.println("Numero de homens = " + genderM);
		
		sc.close();

	}

}
