package javamocks.t04.q45;

import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.time.YearMonth;

public class App {
	public static void main(String[] args) {
		
		// Create some Year
		Year y1 = Year.of(1980);
		Year y2 = Year.parse("2000");
		System.out.println(y1 + ", " + y2);
		
		// Create Month
		Month m1 = Month.OCTOBER;
		System.out.println(m1);
		
		// Create MonthYear with Month
		YearMonth ym1 = YearMonth.of(1980, m1);
		System.out.println(ym1);
		YearMonth ym2 = YearMonth.of(1999, m1);
		System.out.println(ym2);
		
		// Create LocalDate with Month
		LocalDate ld = y1.atDay(290);
		System.out.println(ld);
	}
}
