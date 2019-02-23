package problem1;

import java.util.Scanner;

public class Mars {
static int x;
static int s;
	static  String marsExploration(String s) {
		if(s.equals(x)) {
			
			System.out.println("equal");
		}else {
			
			System.out.println("not equal");
		}
		return s;
		
		
		
	}
	public static void main(String[] args) {
		
      Scanner sc = new Scanner(System.in);
      
      System.out.println("enter the sent code");
       String s = sc.nextLine();
       
       System.out.println("enter the recieved code");
       String x = sc.nextLine();
      String result = marsExploration(s);
      
	}

}
