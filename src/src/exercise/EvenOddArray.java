package exercise;

import java.util.Scanner;

public class EvenOddArray {
	
       static Scanner sc= new Scanner(System.in);
	int a[];
	int b[];
	static void Array(int a[],int b[]) {
		
		for (int i = 0; i < b.length; i++) {
			int num = 0;
			if(num % 2 == 0) {
			System.out.println("even array");	
				
			}
			else {
				System.out.println("odd array");
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		System.out.println("enter the elements of array a");
		int a= sc.nextInt();
		int n[] = new int[a];
		for (int i = 0; i < n.length; i++) {
		n[i]=sc.nextInt();	
		}
		
		System.out.println("enter the elements of array b");
	    int x = sc.nextInt();
	    int m[] = new int[x];
	    for (int i = 0; i < n.length; i++) {
			m[i]=sc.nextInt();	
			}
	}
		
		
		 
		
	        
       
	


	private static int nextInt() {
		// TODO Auto-generated method stub
		return 0;
	}

}
