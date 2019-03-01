package conditional;

import java.util.Scanner;

public class Nestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter three numbers");
int a,b,c;
   a=sc.nextInt();
   b=sc.nextInt();
   c=sc.nextInt();
   if(a==b && b==c) {
    
    	 System.out.println("all are equal");
	}
   else if(a>b){
	   if(a>c)
      System.out.println("a is greater");
}
   else if(c>b){
	   System.out.println("c is greater");
}
   else {
	   System.out.println("a is greater");
   }
	}
}