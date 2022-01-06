package inheritance.p247;

abstract class Toy {
	int price;
	
	// A:
	public static void insertToy() {
		/* code goes here */
	}
	
	// B:
//	public abstract Toy getToy() {
//		return new Toy();
//	}
	
	// C:
//	public void printToy();
	
	// D:
	public int calculatePrice() {
		return price;
	}
	
	// E:
	public abstract int computeDiscount();
}
