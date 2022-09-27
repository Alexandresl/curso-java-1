package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Program {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Date x1 = new Date(); // Instancia a data atual
		Date x2 = new Date(System.currentTimeMillis()); 
		Date x3 = new Date(0L);
		Date x4 = new Date(1000L * 60 * 60 * 5);
		
		Date y1 = sdf1.parse("25/06/2018");
		Date y2 = sdf2.parse("25/06/2018 15:42:07");
		Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println("-----------------------");
		System.out.println("x1: " + x1); // x1: Tue Sep 27 20:44:00 BRT 2022
		System.out.println("x2: " + x2); // x2: Tue Sep 27 20:44:00 BRT 2022
		System.out.println("x3: " + x3); // x3: Wed Dec 31 21:00:00 BRT 1969
		System.out.println("x4: " + x4); // x4: Thu Jan 01 02:00:00 BRT 1970
		System.out.println("y1: " + y1); // y1: Mon Jun 25 00:00:00 BRT 2018
		System.out.println("y2: " + y2); // y3: Mon Jun 25 12:42:07 BRT 2018
		
		System.out.println("-----------------------");
		System.out.println("x1: " + sdf2.format(x1)); // x1: 27/09/2022 20:37:47
		System.out.println("x2: " + sdf2.format(x2)); // x2: 27/09/2022 20:37:47
		System.out.println("x3: " + sdf2.format(x3)); // x3: 31/12/1969 21:00:00
		System.out.println("x4: " + sdf2.format(x4)); // x4: 01/01/1970 02:00:00
		System.out.println("y1: " + sdf2.format(y1)); // y1: 25/06/2018 00:00:00
		System.out.println("y2: " + sdf2.format(y2)); // y2: 25/06/2018 15:42:07
		System.out.println("y3: " + sdf2.format(y3)); // y3: 25/06/2018 12:42:07
		
		System.out.println("-----------------------");
		System.out.println("x1: " + sdf3.format(x1)); // x1: 27/09/2022 23:44:00
		System.out.println("x2: " + sdf3.format(x2)); // x2: 27/09/2022 23:44:00
		System.out.println("x3: " + sdf3.format(x3)); // x3: 01/01/1970 00:00:00
		System.out.println("x4: " + sdf3.format(x4)); // x4: 01/01/1970 05:00:00
		System.out.println("y1: " + sdf3.format(y1)); // y1: 25/06/2018 03:00:00
		System.out.println("y2: " + sdf3.format(y2)); // y2: 25/06/2018 18:42:07
		System.out.println("y3: " + sdf3.format(y3)); // y3: 25/06/2018 15:42:07
		

	}

}
