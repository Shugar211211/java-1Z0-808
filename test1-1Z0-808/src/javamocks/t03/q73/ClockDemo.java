// https://www.geeksforgeeks.org/java-time-clock-class-in-java/

package javamocks.t03.q73;

import java.time.Clock;

public class ClockDemo {
	
	public static void main(String[] args) {
		
		Clock c1 = Clock.systemUTC();
		System.out.println("UTC time = " + c1.instant());
		System.out.println(c1 instanceof Clock );
	
		Clock c2 = Clock.systemDefaultZone();
		System.out.println(c2);
		System.out.println("Clock with default zone of the system: " + c2.instant());
		System.out.println("Time zone: " + c2.getZone());
		
//		System.out.println("Clock.instant: " + Clock.instant());
//		System.out.println("Clock.system: " + Clock.system());
	}
}
