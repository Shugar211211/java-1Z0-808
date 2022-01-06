package javamocks.t01.q06;

public class Program {

	static int x = 11;
	private int y = 33;
	
	public static void main(String[] args) {
		Program pro = new Program();
		pro.method(5);
		System.out.print(Program.x);
		System.out.print(" " + pro.x);
		System.out.print(" " + pro.y);
	}
	
	public void method(int x) {
		x = 10;
		y = 12;
	}

}
