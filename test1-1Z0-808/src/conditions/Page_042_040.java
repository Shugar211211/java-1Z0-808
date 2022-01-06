package conditions;

public class Page_042_040 {
	public static void main(String[] args) {
		int x = 100;
		int a = x++;
		int b = ++x;
		int c = x++;
		
		// Page 040
//		int d1 = (a < b) ? (a < c) ? a : (b < c) ? b : c;
//		System.out.println(d1);
		
		// Page 042
		int d2 = (a < b) ? (a < c) ? a : (b < c) ? b : c : x;
		System.out.println(d2);
	}
}
