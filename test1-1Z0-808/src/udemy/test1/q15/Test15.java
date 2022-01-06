package udemy.test1.q15;

public class Test15 {

	public static void main(String[] args) {
		String s1 = "OCAJP";
		String s2 = "OCAJP" + "";
		System.out.println(s1 == s2);
		s1 += "...";
		System.out.println(s1);
		System.out.println(s2);
	}

}
