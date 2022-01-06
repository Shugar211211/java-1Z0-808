package udemy.test1.q63;

import java.io.IOException;

public class Test {
	public static void main(String[] args) {
		Super s = new Sub();
		try {
			s.m1();
		} 
//		catch (FileNotFoundException e)
		catch (IOException e)
		{
			System.out.println("M");
		} finally {
			System.out.println("N");
		}
	}
}
