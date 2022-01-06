package udemy.test1.q63;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Sub extends Super {
	@Override
	public void m1() throws IOException {
		System.out.println("Inside Sub class.");
		throw new FileNotFoundException();
	}
}
