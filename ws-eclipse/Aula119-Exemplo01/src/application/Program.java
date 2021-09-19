package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf1 = new SimpleDateFormat("MM/yyyy");
		
		System.out.print("Enter department's name: ");
		String department = sc.nextLine();
		System.out.println("Enter worker data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Level: ");
		String level = sc.nextLine();
		System.out.print("Base salary: ");
		double baseSalary = sc.nextDouble();
		
		Worker worker = new Worker(name, WorkerLevel.valueOf(level), baseSalary, new Department(department));
		
		System.out.print("How many contracts to this worker? ");
		int numberContracts = sc.nextInt();
		
		for (int i = 0; i < numberContracts; i++) {
			System.out.println("Enter contract #" + (i + 1) + " data:");
			System.out.print("Date (DD/MM/YYYY): ");
			Date date = sdf.parse(sc.next());
			System.out.print("Value per hour: ");
			Double valuePerHour = sc.nextDouble();
			System.out.print("Duration (hours): ");
			int duration = sc.nextInt();
			
			worker.addContract(new HourContract(date, valuePerHour, duration));
		}
		
		System.out.println();
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		Calendar cal = Calendar.getInstance();
		String monthAndYear = sc.next();
		Date searchDate = sdf1.parse(monthAndYear);
		cal.setTime(searchDate);
		int year = cal.get(Calendar.YEAR);
		int month = 1 + cal.get(Calendar.MONTH);
		
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));
		
		sc.close();

	}

}
