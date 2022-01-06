package javamocks.t04.q64;

import static java.lang.Math.*;		// used in line 3

public class StaticImportDemo {

	public static void main(String[] args) {
		System.out.println(sqrt(64));
		System.out.println(Math.sqrt(49));
		System.out.println(java.lang.Math.sqrt(36));
	}

}
