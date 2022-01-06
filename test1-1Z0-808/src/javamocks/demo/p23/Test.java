package javamocks.demo.p23;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		
		Instant start = Instant.now();
		
		list.forEach( s -> System.out.println(s) );
		
		Instant end = Instant.now();
		
		long duration = Duration.between(start, end).toMillis();
		
		System.out.println(duration);
		
	}

}
