package exercise;

import java.util.Scanner;

public class PhotoUpload {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l=45;
		int n=1;
	   
		
		System.out.println("enter values of width,height");
	      int width = sc.nextInt();
	      int height=sc.nextInt();
		
			
		if((width >=45)&& (height>=45)){
			if(width==height) {
				System.out.println("Accepted");
			}
			else {
				System.out.println("Crop it");
			}
		}
		else {
			System.out.println("select another photo");
				
		}
	}

}
