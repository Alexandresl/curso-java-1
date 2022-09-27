package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		
		List<Employee> employees = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			
			System.out.println();
			System.out.println("Employee #" + (i + 1) + ":");
			
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			employees.add(new Employee(id, name, salary));			
			
		}
		
		System.out.println();
		System.out.print("Enter the employee id that sill have salary increase: ");
		int id = sc.nextInt();
		
		boolean find = false;
		
		for (Employee x : employees) {
			
			if (x.getId() == id) {
				System.out.print("Enter the percentage: ");
				double percent = sc.nextDouble();
				x.increaseSalary(percent);
				find = true;
			}
			
		}
		
		if (!find) { 
			System.out.println("This id does not exist!");; 
		}
		
		System.out.println();
		System.out.println("List of employees:");
		
		for (Employee emp : employees) {
			System.out.println(emp);
		}
		
		sc.close();
		
	}

}
