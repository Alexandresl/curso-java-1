package application;

import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Program {

	public static void main(String[] args) {
		
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		int minutes = cal.get(Calendar.MINUTE);
		int month = 1 + cal.get(Calendar.MONTH);
		
		System.out.println("Minutes: " + minutes); // Minutes: 42
		System.out.println("Month: " + month); // Month: 6

	}

}
