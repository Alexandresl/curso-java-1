package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> employees = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			Employee emp;
			System.out.println("Employee #" + (i + 1) + " data:");
			System.out.print("Outsourced (y/n)? ");
			
			char out = sc.next().charAt(0);
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			Double valuePerHour = sc.nextDouble();
			
			if (out == 'y') {
				System.out.print("Additional charge: ");
				Double additionalCharge = sc.nextDouble();
				emp = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
			} else {
				emp = new Employee(name, hours, valuePerHour);
			}
			
			employees.add(emp);
			
		}
		
		System.out.println();
		System.out.println("PAYMENTS:");
		for (Employee emp : employees) {
			System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
		}
		
		sc.close();

	}

}
