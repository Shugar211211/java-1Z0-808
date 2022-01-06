package udemy.test3.q37;

public class Test37 {
	public static void main(String[] args) {
		Error obj = new Error();
//		boolean flag1 = obj instanceof RuntimeException;
//		boolean flag2 = obj instanceof Exception;
		boolean flag3 = obj instanceof Error;
		boolean flag4 = obj instanceof Throwable;
//		System.out.println(flag1 + ":" + flag2 + ":" + flag3 + ":" + flag4);
		System.out.println(flag3 + ":" + flag4);
	}
}
