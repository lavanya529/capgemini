package exercise;

import java.util.Scanner;

public class MergeSortedArrays {
 int a[];
 int b[];
	static Scanner sc = new Scanner(System.in);
	
	static void merge(int a[],int b[]) {
		for (int i = 0; i < b.length; i++) {
			if(a[i]>a[i+1]) {
				a[i]=a[i+1];
			}
		}
		
	}
	public static void main(String[] args) {
		
		    int a[]= new int[5];
			int b[]= new int[6];
			for (int i = 0; i < b.length; i++) {
				
			
		System.out.println("enter elements of array a");
		int a1 = sc. nextInt(5);
			}
			for (int j = 0; j < b.length; j++) {
				
			
		System.out.println("enter elements of array b");
        int b1 = sc. nextInt(6);
			}
		Object c = concatenate(a,b);
	}
	private static Object concatenate(int[] a2, int[] b2) {
		return null;
		
		
	}

}
