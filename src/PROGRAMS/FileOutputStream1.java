package PROGRAMS;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;
public class FileOutputStream1 {

	public static void main(String[] args) {
	
		

		try {
			Scanner sc = new Scanner("System.in");
			FileOutputStream fos =new FileOutputStream("D:\\lavanya\\program.txt");
			System.out.println("enter integer");
			int n = sc. nextInt();
			fos.write(n);
			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
		