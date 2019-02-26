package collectionsEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Annogram {
	
	


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter string1");
		String str1  = sc.next();
		System.out.println("enter string2");
		String str2 = sc.next();
stringCompare(str1, str2);
	}
	public static void stringCompare(String str1,String str2) {
		
	ArrayList<Character> al1 = new ArrayList<>();
	ArrayList<Character> al2 = new ArrayList<>();
	for (int i = 0; i < str1.length(); i++) {
		al1.add(str1.charAt(i));
		al2.add(str2.charAt(i));	
	}
	
	Collections.sort(al1);
	Collections.sort(al2);
	
	if(al1.equals(al2)) {
		System.out.println("annogram");
	}else {
		System.out.println("not an annogram");
	}
	return;
		
	}
}




