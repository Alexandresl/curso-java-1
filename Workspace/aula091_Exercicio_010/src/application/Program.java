package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos serao digitados? ");
		int n = sc.nextInt();
		
		Student[] students = new Student[n];
		
		for (int i = 0; i < students.length; i++) {
			sc.nextLine();
			System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "o aluno:");
			String name = sc.nextLine();
			double grade1 = sc.nextDouble();
			double grade2 = sc.nextDouble();
			students[i] = new Student(name, grade1, grade2);
			
		}
		
		System.out.println("Alunos aprovados:");
		
		for (int i = 0; i < students.length; i++) {
			
			double media = (students[i].getGrade1() + students[i].getGrade2()) / 2;
			
			if (media >= 6.0) {
				System.out.println(students[i].getName());
			}
			
		}
		
		sc.close();

	}

}
