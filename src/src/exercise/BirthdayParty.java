package exercise;

import java.util.Scanner;

public class BirthdayParty {

	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		
		
		System.out.println("enter number of friends");
		int n=sc.nextInt();
		System.out.println("enter number of chocolates in packet");
		int p = sc.nextInt();
		
		if(p%n==0) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
		
	}

}
