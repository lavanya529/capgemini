package exception;
//check once
import java.util.Scanner;

public class MyCalculator {
	static Scanner sc= new Scanner(System.in);
	static int n;
	static int p;
	
	static void power(int n[]base,int p[]power ) {
	

           for(int i = 0; i < n.length; i++) {
        	   for (int j = 0; j < p.length; j++) {
				
			
        if((n && p )<0) {
		
			System.out.println("n or p should not be negative");
		
		}else if(p == 0) {
			
			System.out.println("p should not be zero");
		}else {
			
			Object result = power (n , p);
			
		}	
           }
		}
	}
	
	private static Object power(int n2, int p2) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[] args) {
		
		MyCalculator obj=new MyCalculator();
		System.out.println("enter number of elements");
		int x = sc.nextInt();
		
		int n[] = new int[x];
		for (int i = 0; i < n.length; i++) {
			
		 n[i]=sc.nextInt();
		}
//
		
		int p[] = new int[x];
		for (int i = 0; i < n.length; i++) {
			
		
        p[i] =sc.nextInt();
		
		}	
            obj.power(n,p);
}
	//private static Object power(int n2, int p2) {
		// TODO Auto-generated method stub
		//return null;
	//}
}