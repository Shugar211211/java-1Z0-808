package javamocks.t02.q75;

import java.sql.Timestamp;
import java.time.Instant;

public class App {
	public static void main(String[] args) {
	Timestamp stamp1 = Timestamp.from(Instant.now());
	System.out.println(stamp1);
	Timestamp stamp2 = new Timestamp(0);
	System.out.println(stamp2);
	}
}
