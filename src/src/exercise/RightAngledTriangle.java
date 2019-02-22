package exercise;

import java.util.Scanner;

public class RightAngledTriangle {
	
	int a;
	int b;
	static int c;
	
	 if(a>b&&a>c)
     {
         if((a*a)==(b*b)+(c*c))
         System.out.println("It is a right-angled triangle");
         else 
         System.out.println("It is not a right-angled triangle");
        }
        if(b>c&&b>a)
        {
            if((b*b)==(c*c)+(a*a))
            System.out.println("It is a right-angled triangle");
            else
            System.out.println("It is not a right-angled triangle");
        }
        if(c>a&&c>b)
        {
            if((c*c)==(a*a)+(b*b))
            System.out.println("It is a right-angled triangle");
            else
            System.out.println("It is not a right-angled triangle");
        }
    
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the side lengths a, b, c");
		int x=  sc. nextInt();
		int n[]=new int[x];
	for (int i = 0; i < n.length; i++) {
		
		//power(c,2) = power(b,2) +power(a,2);
		
	}
		
	}


	//private static void power(int c2, int i) {
		// TODO Auto-generated method stub
		
	}

}

