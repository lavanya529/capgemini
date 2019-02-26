package collectionsEx;

import java.util.HashSet;
import java.util.Scanner;

public class Pangram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string");
		String str = (String) sc.next();
	
		

	}
public static void alphabets(String str){
	int index;
	HashSet<String> hashSet = new HashSet<String>();
	
	for (int i = 0; i < str.length(); i++) {
		
		hashSet.add(str.toLowerCase().charAt(i));
		
		
		}
	
	
}
}
