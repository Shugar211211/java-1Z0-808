package collections.p322;

import java.util.ArrayList;

public class TestApp {

	public static void main(String[] args) {
		ArrayList<Integer> points = new ArrayList<>();
		points.add(1);
		points.add(2);
		points.add(3);
		points.add(4);
		points.add(null);
		points.remove(2);
		points.remove(null);
		System.out.println(points);
	}
}
