package collections.p330;

import java.util.Arrays;
import java.util.List;

public class Test330 {

	public static void main(String[] args) {
		String[] arr = {"Hi", "How", "Are", "You"};
		List<String> arrList = Arrays.asList(arr);
		if(arrList.removeIf(s -> { System.out.println(s); return s.length() <=2; })) {
			System.out.println(" removed");
		}
	}
}
