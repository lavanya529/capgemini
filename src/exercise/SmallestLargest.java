package exercise;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestLargest {
	
	static Scanner sc = new Scanner(System.in);
	
	

	public static void main(String[] args) {
		
		
		System.out.println("enter array size");
		int a = sc.nextInt();
        System.out.println("enter array elements");
        int s[] = new int[a];
        for (int i = 0; i < a; i++) {
		
        	s[i]= sc.nextInt();
        }
       
       
        Arrays.sort(s);
        System.out.println("min="+ s[0]);
        System.out.println("max="+ s[a-1]);
	}
}

