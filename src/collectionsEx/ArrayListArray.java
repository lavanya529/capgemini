package collectionsEx;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 
		  ArrayList<Integer> al1=new ArrayList<Integer>();
		  System.out.println("enter integers");
		  int n = sc.nextInt();
		  int y = sc.nextInt();
		  int x = sc.nextInt();
		  
		try {
			FileOutputStream a1 =new FileOutputStream("D:\\lavanya\\array.txt");
			ObjectOutputStream out = new ObjectOutputStream(a1);
            a1.write(n);
		    a1.close();
		
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
