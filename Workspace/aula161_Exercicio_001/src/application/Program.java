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
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		
		List<Employee> emp = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			
			System.out.println("Employee #" + (i + 1) + " data:");
			System.out.print("Outsourced (y/n)? ");
			char outsourced = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			Integer hours = sc.nextInt();
			System.out.print("Value per hour: ");
			Double valuePerHour = sc.nextDouble();
			
			if (outsourced == 'y') {
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				emp.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
			} else {
				emp.add(new Employee(name, hours, valuePerHour));
			}
			
		}
		
		System.out.println();
		System.out.println("PAYMENTS:");
		for (Employee e : emp) {
			System.out.println(e);
		}
		
		sc.close();

	}

}
