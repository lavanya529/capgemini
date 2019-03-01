package PROGRAMS;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import basic.Student;

public class Serialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc = new Scanner(System.in);
 Student student = new Student();
    student.setName("Bob");
    student.setRoll(123);
	student.setFees(1234);
	
	try {
		FileOutputStream fos = new FileOutputStream("D:\\lavanya\\serial.txt");
		ObjectOutputStream out = new ObjectOutputStream(fos);
		
		out.writeObject(student);
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
System.out.println("done");	
	}

}
