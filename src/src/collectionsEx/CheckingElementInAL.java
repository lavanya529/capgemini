package collectionsEx;

import java.util.ArrayList;
import java.util.Scanner;

public class CheckingElementInAL {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	ArrayList<Integer> a1 = new ArrayList<Integer>();
	
   System.out.println("enter elements");
     a1.add(sc.nextInt());
     a1.add(sc.nextInt());
     a1.add(sc.nextInt());
     
     System.out.println("search for an element");
     int x=sc.nextInt();
     
     contains(a1);
     System.out.println(a1.contains(x));
     
     a1. indexOf(2);
     System.out.println(a1.indexOf(x));
	
	}

	private static void contains(ArrayList<Integer> a1) {
		// TODO Auto-generated method stub
		
	}

	

}
