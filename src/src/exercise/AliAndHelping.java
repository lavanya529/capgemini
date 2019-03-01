package exercise;

import java.util.Scanner;

public class AliAndHelping {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//    String code="DDXDDD-DD";
		int i= 0;
		System.out.println("enter the code");
		String str=sc.next();
		//for (int j = 0; j < i; j++) {
			
		char c = 0;
		if(((i+(i+1))%2==0)) {
		 if(((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))) { 
			
			
		}
			System.out.println("not valid");
		}
		else {
			System.out.println("valid");
		}
		//}
	}

}
