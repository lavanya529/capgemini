package collectionsEx;

import java.util.ArrayList;

import basic.Student;
import basic.Student1;

public class SortStudents {

	public static void main(String[] args) {
		
		ArrayList<Student1> al = new ArrayList<Student1>();
		al.add(new Student1(101,"viki",20001));
		al.add(new Student1(102,"Anny",20000));
		al.add(new Student1(103,"HArry",20002));
		
		collections.sort(al);
		for(Student st:al) {
			System.out.println();
		}
	}

}
