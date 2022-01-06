package udemy.test2.q52;

import java.util.function.Predicate;

public class Test52 {
	public static void main(String[] args) {
		String [] arr = {"*", "**", "***", "****", "*****"};
		Predicate<String> pr1 = s -> s.length() < 4;
//		print(arr, pr1);
		print(arr, s -> s.length() < 4);
	}

	private static void print(String[] arr, Predicate<String> predicate) {
		for(String str : arr) {
			if(predicate.test(str)) {
				System.out.println(str);
			}
		}
	}
}
