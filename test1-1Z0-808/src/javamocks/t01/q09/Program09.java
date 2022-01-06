package javamocks.t01.q09;

public class Program09 {

	static int x = 20;
	
	public static void main(String[] args) {
		Program09 pr = new Program09();
		pr.x = 5;
		int y = x/pr.x;
		System.out.print("y = ");
//		System.out.print();
		System.out.println(y);
	}

}
