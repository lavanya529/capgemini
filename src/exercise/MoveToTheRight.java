package exercise;

import java.util.Scanner;

public class MoveToTheRight {
   static int array;
	static Scanner sc = new Scanner(System.in);
	
	
	
	
	static void MoveToRight(int arr[],int n) {
	int count=0;
	
	for (int i = 0; i < arr.length; i++) {
		if(arr[i]!=7) {
			arr[count++]=arr[i];
			
		
			while(count<n) {
				arr[count++]=0;
			}
		}
		
	}
	}
	public static void main(String[] args) {
	for (int i = 0; i < args.length; i++) {
		
	System.out.println("enter array elements");
  	double arr=sc.nextDouble();
		int n= array;
	
	   // MoveToRight(arr,n);
System.out.println("array after pushing 7 to the right");
}
}
}
