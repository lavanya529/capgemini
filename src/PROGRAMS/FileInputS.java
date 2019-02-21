package PROGRAMS;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileInputS {

	public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
try {
	FileInputStream fos = new FileInputStream("D:\\lavanya\\prog.txt");
	int i;
	while((i= FileInputStream.read()) !=-1) {
		System.out.println((char) i);
	}
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

	
}
}
