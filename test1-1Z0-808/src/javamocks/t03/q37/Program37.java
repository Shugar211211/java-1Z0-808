package javamocks.t03.q37;

public class Program37 {
	public static void main(String[] args) {
		String a = "A";
		final String A = "a";
		
		switch (a) {
		default: System.out.println("default");
		case A : System.out.println("1");
		case "A" : System.out.println("2"); break;
		}
	}
}
