package collectionsEx;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import basic.Student;

public class AAL {
  static int count = 1;
	
  public static Student getInfo() {
	  Scanner sc = new Scanner(System.in);
		
     System.out.println("Enter the details of student"+count);

	 Student student = new Student();
	 student.setName(sc.next());
	 student.setRoll(sc.nextByte());
	 student.setFees(sc.nextDouble());
	 
	 count++;
	return student;
  
  }
  
  public static void main(String[] args) {
	ArrayList<Student> s = new ArrayList<Student>();
	s.add(getInfo());
	s.add(getInfo());
	
	System.out.println(s);
	
	try {
		FileOutputStream fos = new FileOutputStream("d:\\lavanya\\arraylist.txt");
		// check once    Object
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	  
	}

}
