package polymorphism.p277;

public abstract class Writer {
	public static void write() {
		System.out.println("Writing...");
	}
	
	public void writeNonStatic() {
		System.out.println("Non static writing...");
	}
}
