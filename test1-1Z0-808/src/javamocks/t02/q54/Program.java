package javamocks.t02.q54;

public class Program {
	
	static Double x;
	
	public static void main(String[] args) {
		try {
			System.out.println(x.doubleValue());
		}
		finally {
			System.out.print("Done");
		}
		
	}
}
