package exercise;

import java.util.Scanner;

import basic.Student;

public class ObjectPassing {

	Scanner sc = new Scanner(System.in);	
	static Student s = new Student();
	
	public static void main(String[] args) {
	
		Student s1 = new Student();
		ObjectPassing ob = new ObjectPassing();
		
		s1=ob.accept();
		ob.display(s1);

	}

	private static void display(Student s) {
		
	System.out.println(s.getName());
	System.out.println(s.getRoll());
	System.out.println(s.getFees());
	
	}

	 public Student accept() {

		System.out.println("enter name");
		s.setName(sc.next());
		System.out.println("enter rollno ");
		s.setRoll(sc.nextInt());
		System.out.println("enter fees");
		s.setFees(sc.nextInt());
		return s;
	}

}
