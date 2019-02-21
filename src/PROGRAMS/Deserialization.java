package PROGRAMS;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import basic.Student;

public class Deserialization {

	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("D:\\lavanya\\serial.txt");
			ObjectInputStream in = new ObjectInputStream(fis);
			
			Student s = (Student)in.readObject();
			s.setFees(1234);
			s.setRoll(123);
            System.out.println((s.getName())+" "+s.getRoll()+" "+s.getFees());
			//in.readObject();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	System.out.println("done");	
	}

}
