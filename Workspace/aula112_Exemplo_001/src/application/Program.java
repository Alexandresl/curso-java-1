package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		
	/**
	  * Link para a especificação do DateTimeFormatter
	  * https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
	  */
		
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME; // formato sem fuso horário
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT; // formato com fuso horário
		
		System.out.println("d04 = " + d04.format(fmt1)); // d04 = 20/07/2022
		System.out.println("d04 = " + fmt1.format(d04)); // d04 = 20/07/2022
		System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))); // d04 = 20/07/2022
		System.out.println("d04 = " + d05.format(fmt4)); // d05 = 2022-07-20T01:30:26
		
		System.out.println();
		System.out.println("d05 = " + d05.format(fmt1)); // d05 = 20/07/2022
		System.out.println("d05 = " + d05.format(fmt2)); // d05 = 20/07/2022 01:30
		
		System.out.println();
		System.out.println("d06 = " + fmt3.format(d06)); // d05 = 20/07/2022 01:30
		System.out.println("d06 = " + fmt5.format(d06)); // d06 = 2022-07-20T01:30:26Z
		System.out.println("d06 = " + d06); // também imprime no formato ISO - d06 = 2022-07-20T01:30:26Z		
		
	}

}
