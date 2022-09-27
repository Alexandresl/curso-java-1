package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Program {

	public static void main(String[] args) {
		
	/**
	  * Link para a especificação do DateTimeFormatter
	  * https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
	  */
		
		// Converter data-hora global para local

		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		
		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));

		System.out.println("Converter data-hora global para local:");
		System.out.println("r1 = " + r1); // r1 = 2022-07-19 (Brasil  -03:00)
		System.out.println("r2 = " + r2); // r2 = 2022-07-20 (Portugal +01:00)
		System.out.println("r3 = " + r3); // r3 = 2022-07-19T22:30:26 (Brasil  -03:00)
		System.out.println("r4 = " + r4); // r4 = 2022-07-20T02:30:26 (Portugal +01:00)
		
		// Obter dados de uma data-hora local
		System.out.println();
		System.out.println("Obter dados de uma data-hora local:");
		System.out.println("d04 dia = " + d04.getDayOfMonth()); // d04 dia = 20
		System.out.println("d04 mês = " + d04.getMonthValue()); // d04 mês = 7
		System.out.println("d04 ano = " + d04.getYear()); // d04 ano = 2022
		System.out.println("d05 Hora = " + d05.getHour()); // d05 Hora = 1
		System.out.println("d05 minutos = " + d05.getMinute()); // d05 minutos = 30
		
	}

}
