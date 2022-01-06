package javamocks.t04.q59;

public class Q59App {

	public static void main(String[] args) {
		Integer a = Integer.decode("1");
		Integer b = new Integer("2");
		Integer c = Integer.valueOf("3");
		
		System.out.println(a*b*c);
	}

}
