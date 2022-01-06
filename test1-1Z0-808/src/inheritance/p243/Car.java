package inheritance.p243;

public class Car extends Vehicle{
	String trans;

	Car(String trans) {
		super("",0);
		this.trans = trans;
	}
	
	Car(String type, int maxSpeed, String trans) {
		super(type, maxSpeed);
//		this(trans);
	}
}
