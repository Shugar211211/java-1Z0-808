package javamocks.t02.q23;

public class App {
	
	static Integer stVar1;
	
	public static void main(String[] args) {
		
		// static rapper initialized to null by default
		System.out.println(stVar1);
		
		Integer stVar2 = 1;
		Integer stVar3 = 1;
		
		// wrappers are equals if their values are equals
		System.out.println(stVar2 == stVar3);
	}
	
}
