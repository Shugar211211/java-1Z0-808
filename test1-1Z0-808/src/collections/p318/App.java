package collections.p318;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		List<String> colors = new ArrayList<String>();
		colors.add("green");
		colors.add("red");
		colors.add("blue");
		colors.add("yellow");
		colors.remove(2);
		colors.add(4, "cyan");
		System.out.println(colors);
	}

}
