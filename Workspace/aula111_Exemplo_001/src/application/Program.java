package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		
		/**
		 * Link para a especificação do DateTimeFormatter
		 * https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
		 */
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		// (agora) -> Data-hora
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		// Texto ISO 8601 -> Data-Hora
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");
		
		// Texto formato customizado -> Data-hora
		LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
		LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);
		
		// dia, mês, ano, [horário] -> data-hora local
		LocalDate d10 = LocalDate.of(2022, 7, 20);
		LocalDateTime d11 = LocalDateTime.of(2022, 7, 20, 1, 30);
		
		
		System.out.println("(agora) -> Data-hora");
		System.out.println("d01 = " + d01); // d01 = 2022-09-27
		System.out.println("d02 = " + d02); // d02 = 2022-09-27T13:22:45.547121600
		System.out.println("d03 = " + d03); // d03 = 2022-09-27T16:22:45.547121600Z
		
		System.out.println();
		System.out.println("Texto ISO 8601 -> Data-Hora");
		System.out.println("d04 = " + d04); // d04 = 2022-07-20
		System.out.println("d05 = " + d05); // d05 = 2022-07-20T01:30:26
		System.out.println("d06 = " + d06); // d06 = 2022-07-20T01:30:26Z
		System.out.println("d07 = " + d07); // d07 = 2022-07-20T04:30:26Z
		
		System.out.println();
		System.out.println("Texto formato customizado -> Data-hora");
		System.out.println("d08 = " + d08); // d08 = 2022-07-20
		System.out.println("d09 = " + d09); // d09 = 2022-07-20T01:30
		
		System.out.println();
		System.out.println("dia, mês, ano, [horário] -> data-hora local");
		System.out.println("d10 = " + d10); // d10 = 2022-07-20
		System.out.println("d11 = " + d11); // d11 = 2022-07-20T01:30

	}

}
