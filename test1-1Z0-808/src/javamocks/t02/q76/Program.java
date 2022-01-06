package javamocks.t02.q76;

import java.time.LocalDate;

public class Program {
	public static void main(String[] args) {
		LocalDate date = LocalDate.parse("2014-12-30");
		date = date.plusDays(2);
//		date.plusHours(24);
		System.out.println(date.getYear()+" "+date.getMonth()+" "+date.getDayOfMonth());
	}
}
