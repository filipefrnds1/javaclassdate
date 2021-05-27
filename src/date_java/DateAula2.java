package date_java;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class DateAula2 {

	public static void main(String[] args)  throws ParseException {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println(sdf.format(d));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		int minutes = cal.get(Calendar.MINUTE);
		int month = 1 + cal.get(Calendar.MONTH); // month aqui começa com o mes 0, por isso precisamos acrescentar + 1
		
		System.out.println("Month: " + month);
		System.out.println("Minutes: " + minutes);
		
		cal.add(Calendar.HOUR_OF_DAY, 4);
		
		d = cal.getTime();
		
		System.out.println(sdf.format(d));
		
		
	}

}
