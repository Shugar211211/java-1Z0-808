package udemy.test2.q08;

public abstract class Helper {
	int num = 100;
	String operation = null;
	
//	protected abstract void help();
	abstract void help();
	
	void log() {
		System.out.println("Helper-log");
	}
}
