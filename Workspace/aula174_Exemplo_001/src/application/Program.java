package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import model.entities.Reservation;

public class Program {

	public static void main(String[] args) {

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		Scanner sc = new Scanner(System.in);

		System.out.print("Room number: ");
		Integer roomNumber = sc.nextInt();
		System.out.print("Check-in date (dd/MM/yyyy): ");
		LocalDate checkIn = LocalDate.parse(sc.next(), dtf);
		System.out.print("Check-out date (dd/MM/yyyy): ");
		LocalDate checkOut = LocalDate.parse(sc.next(), dtf);

		if (checkOut.isBefore(checkIn)) {
			
			System.out.println("Error in reservation: Check-out date must be after check-in date");
			
		} else {

			Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);
			System.out.println("Reservation: " + reservation);

			System.out.println();
			System.out.println("Enter data to update the reservation:");
			System.out.print("Check-in date (dd/MM/yyyy): ");
			checkIn = LocalDate.parse(sc.next(), dtf);
			System.out.print("Check-out date (dd/MM/yyyy): ");
			checkOut = LocalDate.parse(sc.next(), dtf);
			
			LocalDate now = LocalDate.now();
			if (checkIn.isBefore(now) || checkOut.isBefore(now)) {
				
				System.out.println("Error in reservation: Reservation dates for update must be future dates");
				
			} else if (checkOut.isBefore(checkIn)) {
				
				System.out.println("rror in reservation: Check-out date must be after check-in date");
				
			} else {
				
				reservation.updateDates(checkIn, checkOut);
				System.out.println("Reservation: " + reservation);
				
			}

		}

		sc.close();

	}

}
