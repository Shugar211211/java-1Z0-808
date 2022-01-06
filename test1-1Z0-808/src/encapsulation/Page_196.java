package encapsulation;

// Person class
public class Page_196 {
	String name;
	int age = 25;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Page_196(String name) {
//		this();
		setName(name);
	}
	
	public Page_196(String name, int age) {
//		Page_196(name);
		this(name);	// solution
		setAge(age);
	}

	public String show() {
		return name + " " + age;
	}
	
	public static void main(String[] args) {
		Page_196 p1 = new Page_196("Jesse");
		Page_196 p2 = new Page_196("Walter", 52);
		System.out.println(p1.show());
		System.out.println(p2.show());
	}
}
