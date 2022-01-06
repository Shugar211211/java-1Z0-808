package javamocks.t04.q12;

public class Program {
	public static void main(String[] args) throws Exception{
		Animal a = new Dog();
		Dog d = (Dog)a;
		a.eat();
		d.eat();
		d.eat("meat");
	}
}
