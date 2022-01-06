package javamocks.t01.q27;

public class Test27 {
	public static void main(String[] args) {
		Integer i1 = 160;
		Integer i2 = 160;
		Integer i3 = 10;
		Integer i4 = 10;
		System.out.println((i3==i4) + " " + (i1==i2));
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);
		System.out.println(i1==i2);
		System.out.println(i1.intValue() == i2.intValue());
		
		Double d1 = 1.1d;
		Double d2 = 1.1d;
		System.out.println("Doubles:");
		System.out.println(d1==d2);
		System.out.println(d1.doubleValue() == d2.doubleValue());
		
		System.out.println("Characters: ");
		Character c1 = 67;
		Character c2 = 67;
		Character c3 = 167;
		Character c4 = 167;
		System.out.println(c1==c2);
		System.out.println(c3==c4);
	}
}
