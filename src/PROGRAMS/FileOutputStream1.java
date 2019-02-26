package PROGRAMS;
import java.util.Scanner;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.*;
public class FileOutputStream1 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter integer");
		int n = sc.nextInt();
		try {
			
			FileOutputStream fos =new FileOutputStream("D:\\lavanya\\program.txt");
			//ObjectOutputStream out = new ObjectOutputStream(fos);
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
		