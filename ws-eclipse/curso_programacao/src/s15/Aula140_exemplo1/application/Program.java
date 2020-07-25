package s15.Aula140_exemplo1.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import s15.Aula140_exemplo1.model.entities.Reservation;

/**
 * Fazer um programa para ler os dados de uma reserva de hotel (número do
 * quarto, data de entrada e data de saída) e mostrar os dados da reserva,
 * inclusive sua duração em dias. Em seguida, ler novas datas de entrada e
 * saída, atualizar a reserva, e mostrar novamente a reserva com os daedos
 * atualizados. O programa não deve aceitar dados inválidos para a reserva,
 * conforme as seguintes regras:
 * 
 * - Alterações de reserva só podem ocorrer para datas futuras - A data de saída
 * deve ser maior que a data de entrada
 */

public class Program {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Room number: ");
		int roomNumber = sc.nextInt();
		System.out.print("Check-in date (dd/mm/yyyy): ");
		Date checkin = sdf.parse(sc.next());
		System.out.print("Check-out date (dd/mm/yyyy): ");
		Date checkout = sdf.parse(sc.next());

		if (!checkout.after(checkin)) {
			System.out.println("Error in reservation: check-out date must be after check-in date.");
		} else {

			Reservation reservation = new Reservation(roomNumber, checkin, checkout);

			System.out.println("Reservation: " + reservation);

			System.out.println();
			System.out.println("Enter data to update the reservation:");
			System.out.print("Check-in date (dd/mm/yyyy): ");
			checkin = sdf.parse(sc.next());
			System.out.print("Check-out date (dd/mm/yyyy): ");
			checkout = sdf.parse(sc.next());
			
			Date now = new Date();
			
			if (checkin.before(now) || checkout.before(now)) {
				System.out.println("Error in reservation: reservation dates for update must be future dates");
			} else if (!checkout.after(checkin)) {
				System.out.println("Error in reservation: check-out date must be after check-in date.");
			} else {
				reservation.updateDates(checkin, checkout);
				System.out.println("Reservation: " + reservation);
			}
			

		}

		sc.close();

	}

}
