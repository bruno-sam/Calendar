package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Program  {
	public static void main(String[] args) throws ParseException {
 
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
	System.out.println(sdf.format(d));
	
	 //Usando calendar 
	Calendar cal = Calendar.getInstance();
	cal.setTime(d);
	int minutes = cal.get(Calendar.MINUTE);
	int month = 1 + cal.get(Calendar.MONTH);
	System.out.println("Minutes: " + minutes);
	System.out.println("Month: " + month);
	System.out.println("_______________________ " );
	
	
	//Somando uma unidade de tempo
	SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	Date d2 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
	System.out.println(sdf2.format(d));
	Calendar cal2 = Calendar.getInstance();
	cal2.setTime(d2);
	cal2.add(Calendar.HOUR_OF_DAY, 4);
	d2 = cal2.getTime();
	System.out.println(sdf2.format(d2));
	
	}
}
