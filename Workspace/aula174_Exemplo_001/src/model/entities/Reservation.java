package model.entities;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Reservation {
	
	private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	private Integer roomNumber;
	private LocalDate checkIn;
	private LocalDate checkOut;
	
	public Reservation() {
	}
	
	public Reservation(Integer roomNumber, LocalDate checkin, LocalDate checkout) {
		this.roomNumber = roomNumber;
		this.checkIn = checkin;
		this.checkOut = checkout;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public LocalDate getCheckin() {
		return checkIn;
	}

	public LocalDate getCheckout() {
		return checkOut;
	}
	
	public Integer duration() {
		return (int) Duration.between(checkIn.atStartOfDay(), checkOut.atStartOfDay()).toDays();
	}
	
	public void updateDates(LocalDate checkin, LocalDate checkout) {
		this.checkIn = checkin;
		this.checkOut = checkout;
	}
	
	@Override
	public String toString() {
		return "Room "
				+ roomNumber
				+ ", check-in: "
				+ checkIn.format(dtf)
				+ ", check-out: "
				+ checkOut.format(dtf)
				+ ", "
				+ duration()
				+ " nights";
	}

}
