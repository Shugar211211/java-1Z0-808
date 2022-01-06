package udemy.test2.q54;

public class Test54 {
	private static void add(double d1, double d2) {
		System.out.println("double version: " + (d1 + d2));
	}
	
	private static void add(Double d1, Double d2) {
		System.out.println("Double version: " + (d1 + d2));
	}
	
	public static void main(String[] args) {
		add(10.0, new Integer(10));
		add(10.0, 5.0);
//		add(10.0, new Double(7.0));
		add(new Integer(10), 5.0);
		add(new Double(7.0), new Double(7.0));
	}
}
