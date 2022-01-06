package encapsulation.p208;

public class Employee {
	String name;
	boolean contract;
	double salary;
	
	Employee() {
		// line n1
		
//		// C
//		this.name = new String("Joe");
//		this.contract = new Boolean(true);
//		this.salary = new Double(100);
		
		// D
		name = "Joe";
		contract = true;
//		contract = TRUE;
		salary = 100f;
		
	}
	
	public String toString() {
		return name + " : " + contract + " : " + salary;
	}
	
	public static void main(String[] args) {
		Employee e = new Employee();
		// line n2
		
//		// A
//		e.name = "Joe";
//		e.contract = true;
//		e.salary = 100;
		
//		// B
//		this.name = "Joe";
//		this.contract = true;
//		this.salary = 100;
		
		System.out.println(e);
	}
}
