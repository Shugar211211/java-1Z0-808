package udemy.test3.q56;

import java.util.ArrayList;
import java.util.List;

public class Test56 {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
        students.add(new Student("James", 25));
        students.add(new Student("James", 27));
        students.add(new Student("James", 25));
        students.add(new Student("James", 25));

        students.remove(new Student("James", 25));

        for(Student stud : students) {
            System.out.println(stud);
        }
        
        // additional test:
        Student s1 = new Student("Eugeny", 100);
        Student s2 = new Student("Eugeny", 100);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s2));
	}
}
