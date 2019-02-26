package exercise;

import java.util.Scanner;

public class RightAngledTriangle {
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the side lengths a, b, c");
		int a=  sc. nextInt();
		int b=  sc. nextInt();
		int c=  sc. nextInt();
		
	
		     if((a*a)==(b*b)+(c*c)||(b*b)==(c*c)+(a*a)||(c*c)==(a*a)+(b*b))
	         System.out.println("It is a right-angled triangle");
	         else 
	         System.out.println("It is not a right-angled triangle");
	        
		
		
		
	}


	//private static void power(int c2, int i) {
		// TODO Auto-generated method stub
		
	}






