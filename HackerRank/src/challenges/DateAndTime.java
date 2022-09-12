package challenges;

import java.util.Calendar;
import java.util.Locale;


public class DateAndTime {
	
	// input as MM DD YYYY, like 09 29 2099
	int month, day, year;
	// output result, like SATURDAY
	String dayOfTheWeek;
	

//	LocalDate dt = LocalDate.of(yy, mm, dd);
//	System.out.print(dt.getDayOfWeek());
//	
//	public static String getDay(String day, String month, String year) {
//	    int d = Integer.valueOf(day);
//	    int m = Integer.valueOf(month);
//	    int y = Integer.valueOf(year);
//	    LocalDate date = LocalDate.of(y, m, d);
//	    return date.getDayOfWeek().toString();
//	}
	
	public static String findDay(int month, int day, int year) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.MONTH, month-1);
        cal.set(Calendar.DAY_OF_MONTH, day);
        cal.set(Calendar.YEAR, year);
        return cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase();     
    }
}
