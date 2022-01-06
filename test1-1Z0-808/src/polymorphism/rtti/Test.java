package polymorphism.rtti;

public class Test {
	public static void main(String[] args) {
		
		ClassA a = new ClassA();
		a.show();
		ClassB b = new ClassB();
		b.show();
		ClassC c = new ClassC();
		c.show();
		
		System.out.println();
		
		ClassA aa = new ClassA();
		aa.show();
		ClassA ab = new ClassB();
		ab.show();
		ClassA ac = new ClassC();
		ac.show();
		
		System.out.println();
		
		System.out.println("Cast B to A:");
		ac = (ClassA)ab;
		ac.show();
		System.out.println(ac.getClass());
		
		System.out.println("Cast B to A:");
		ClassA aba = new ClassB();
		ClassA ba = (ClassA)aba;
		ba.show();
		System.out.println(ac.getClass());
		
//		ClassC ca = (ClassC) ac;
//		ca.show();
	}
}
