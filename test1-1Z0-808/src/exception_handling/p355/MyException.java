package exception_handling.p355;

public class MyException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		try {
			method1();
		}
		catch(MyException ne) {
			System.out.println("A");
		}
	}
	
	public static void method1() {	// line n1
		try {
//			throw Math.random() > 0.5 ? new MyException() : new RuntimeException();
			throw new MyException();
		}
		catch (RuntimeException re) {
			System.out.println("B");
		}
	}
}
