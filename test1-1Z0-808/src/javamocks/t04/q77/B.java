package javamocks.t04.q77;

public class B extends A{

	public static void main(String[] args) {
		Inter in = new B();
		A a = new B();
		System.out.println(in instanceof Inter);
		System.out.println(a instanceof Inter);
		System.out.println(in instanceof A);
		System.out.println(a instanceof A);
		System.out.println(in instanceof B);
		System.out.println(a instanceof B);
	}

}
