package variables;

public class Page_010 {
	public static void main(String[] args) {
		Short s1 = 200;
		Integer s2 = 400;
		Long s3 = (long)s1 + s2;			// line n1
//		String s4 = (Long)(s3 * s2);		// line n2 <<< error: cannot cast from long to String
		String s4 = Long.toString(s3 * s2);	// fix
		System.out.println("Sum is: " + s4);
	}
}
