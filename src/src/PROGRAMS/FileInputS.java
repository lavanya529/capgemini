package PROGRAMS;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileInputS {

	public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
try {
	FileInputStream fos = new FileInputStream("D:\\lavanya\\program.txt");
	int i;
	//while((i=fos.read()) !=-1) {
		System.out.println(fos.read());
	//}
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

	
}
}
