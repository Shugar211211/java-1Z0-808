package javamocks.t04.q46;

import java.time.LocalDate;
import java.time.MonthDay;
import java.time.Year;
import java.time.format.DateTimeFormatter;

public class App {
	public static void main(String[] args) {
		
		Year y = Year.of(2011);
		
		String day = y.atMonthDay(MonthDay.of(2, 23))
				.format(DateTimeFormatter.BASIC_ISO_DATE);
		
		System.out.println(day);
		
		// the same as above extended:
		
		MonthDay monthDay = MonthDay.of(2, 23);
		
		LocalDate localDate = y.atMonthDay(monthDay);
		
		String day0 = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);
		
		String day1 = localDate.format(DateTimeFormatter.ISO_DATE);
		
		String day2 = localDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
		
		System.out.println(day0);
		
		System.out.println(day1);
		
		System.out.println(day2);
	}
}
