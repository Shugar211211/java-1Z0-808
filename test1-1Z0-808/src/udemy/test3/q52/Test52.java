package udemy.test3.q52;

import java.util.ArrayList;
import java.util.List;

public class Test52 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
        list.add(110);
        list.add(new Integer(110));
        list.add(110);

        System.out.println(list.get(0)==list.get(2));
        
        list.removeIf(i -> i == 110);
        System.out.println(list);
	}
}
