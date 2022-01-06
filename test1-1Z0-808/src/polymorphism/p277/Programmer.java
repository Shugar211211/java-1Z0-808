package polymorphism.p277;

public class Programmer extends Writer {
	public static void write() {
		System.out.println("Writing code");
	}
	
	public void writeNonStatic() {
		System.out.println("Non static writing code");
	}
	
	public static void main(String[] args) {
		Writer w = new Programmer();
		w.write();
		w.writeNonStatic();
		Programmer p = new Programmer();
		p.write();
		p.writeNonStatic();
		
	}
}
