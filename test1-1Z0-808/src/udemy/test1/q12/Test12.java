package udemy.test1.q12;

public class Test12 {

	public static void m(int x) {
		System.out.println("int version");
	}
	
	public static void m(char x) {
		System.out.println("char version");
	}
	
	public static void main(String[] args) {
		int i = '5';
		System.out.println(i);
		m(i);
		m('5');
	}

}
