package inheritance.p231;

public class Test {

	public static void main(String[] args) {
		Employee employee = new Employee();
		Employee manager = new Manager();
		Employee director = new Director();
		employee.salary = 50_000;
		director.salary = 80_000;
//		manager.budget = 1_000_000;
	}
}
