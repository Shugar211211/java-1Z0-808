package javamocks.t04.q42;

import java.util.ArrayList;

public class App {
	public static void main(String[] args) {
		
		ArrayList<Book> library1 = new ArrayList<>();
		System.out.println(library1.size());
		
		ArrayList<Book> library2 = new ArrayList<>(10);
		System.out.println(library2.size());
		
		ArrayList<Book> library3 = new ArrayList<Book>();
		System.out.println(library3.size());
		
		ArrayList<Book> library4 = new ArrayList<Book>(10);
		System.out.println(library4.size());
	}
}
