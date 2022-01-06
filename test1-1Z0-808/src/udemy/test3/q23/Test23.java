package udemy.test3.q23;

public class Test23 {
	public static void main(String[] args) {
		int a = 20;
//		int var = --a * a++;
//		int var = --a * a++ + a--;
		int var = --a * a++ + a-- - --a;
		System.out.println("a = " + a);
		System.out.println("var = " + var);
	}
}
