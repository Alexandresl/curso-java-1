package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program {

	public static void main(String[] args) {
		
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		
		LocalDate pastWeekLocalDate = d04.minusDays(7);
		LocalDate nextWeekLocalDate = d04.plusDays(7);
		
		LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
		LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);
		
		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);
		
		System.out.println();
		System.out.println("Data-hora +/- tempo -> Data-hora");
		System.out.println("pastWeekLocalDate: " + pastWeekLocalDate); // pastWeekLocalDate: 2022-07-13
		System.out.println("nextWeekLocalDate: " + nextWeekLocalDate); // nextWeekLocalDate: 2022-07-27
		System.out.println("pastWeekLocalDateTime: " + pastWeekLocalDateTime); // pastWeekLocalDateTime: 2022-07-13T01:30:26
		System.out.println("pastWeekLocalDateTime: " + nextWeekLocalDateTime); // pastWeekLocalDateTime: 2022-07-27T01:30:26
		System.out.println("pastWeekInstant: " + pastWeekInstant); // pastWeekInstant: 2022-07-13T01:30:26Z
		System.out.println("nextWeekInstant: " + nextWeekInstant); // nextWeekInstant: 2022-07-27T01:30:26Z
		
		Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
		Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
		Duration t3 = Duration.between(pastWeekInstant, d06);
		Duration t4 = Duration.between(d06, pastWeekInstant);
		
		System.out.println();
		System.out.println("Data-hora 1, Data-hora 2 -> Duração");
		System.out.println("t1 em dias: " + t1.toDays()); // t1 em dias: 7
		System.out.println("t2 em dias: " + t2.toDays()); // t2 em dias: 7
		System.out.println("t3 em dias: " + t3.toDays()); // t3 em dias: 7
		System.out.println("t4 em dias: " + t4.toDays()); // t4 em dias: -7

	}

}
