package udemy.test3.q54;

import java.util.ArrayList;
import java.util.List;

public class Test54 {
	public static void main(String[] args) {
		List<Boolean> list = new ArrayList<>();
        list.add(true);
        list.add(new Boolean("tRue"));
        list.add(new Boolean("abc"));
//        list.add(new Boolean("tRue"));

        if(list.remove(1)) {
            list.remove(1);
        }

        System.out.println(list);
	}
}
