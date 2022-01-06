package javamocks.t03.q03;

import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(3);
		System.out.println(Math.max(list.get(0), list.get(1)));
	}

}
