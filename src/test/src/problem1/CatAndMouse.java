package problem1;

import java.util.Scanner;

public class CatAndMouse {
 static int q;
 static int x= 2;
 static int y=5;
 static int z=4;
 
	public static void main(String[] args) {
		

		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter quries");
		 String s = sc.nextLine();
		 s= new String(s);
		 String result = catAndMouse(x,y,z);
			
		
			
	
	}
	public static String catAndMouse(int x, int y, int z) {
		
		
			if(speed(x)>speed(y)) {
				System.out.println("print catA");
				
			}
			else if(speed(x)<speed(y)) {
				System.out.println("print catB");
				
			}
			else {
				System.out.println("print cat C");
			}
			return catAndMouse(x,y,z);
			
		
		
	 }
	private static int speed(int y2) {
		// TODO Auto-generated method stub
		return 0;
	}
}
