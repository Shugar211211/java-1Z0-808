package udemy.test3.q45;

public class Test45 {
	
	private static void m1() {
        System.out.println(1/0);
    }
	
	public static void main(String[] args) {
		try {
            m1();
        } finally {
            System.out.println("A");
        }
	}
}
