package inheritance.p243;

public class App {

	public static void main(String[] args) {
		Car c1 = new Car("Auto");
		Car c2 = new Car("4W", 150, "Auto");
		System.out.println(c1.type + " " + c1.maxSpeed + " " + c1.trans);
		System.out.println(c2.type + " " + c2.maxSpeed + " " + c2.trans);
	}

}
