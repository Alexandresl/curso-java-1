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
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int qtdEmployee = sc.nextInt();
		System.out.println();
		
		for (int i = 1; i <= qtdEmployee; i++) {
			System.out.println("Employee #" + i + ":");
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			System.out.println();
			Employee emp = new Employee(id, name, salary);
			list.add(emp);
		}
		
		System.out.print("Enter the employee id that will have salary increase: ");
		int employeeId = sc.nextInt();
		boolean found = false;
		
		for (Employee emp : list) {
			if (emp.getId() == employeeId) {
				System.out.print("Enter the percentage: ");
				double percentage = sc.nextDouble();
				found = true;
				emp.increaseSalary(percentage);
			}
		}
		
		if (found == false) {
			System.out.println("This id does not exist!");
		}
		
		System.out.println();
		
		System.out.println("List of employees:");
		for (Employee emp : list) {
			System.out.println(emp);
		}
		
		sc.close();

	}

}
