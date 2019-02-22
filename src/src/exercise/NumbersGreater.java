package exercise;

import java.util.Scanner;

public class NumbersGreater {

	static Scanner sc = new Scanner(System.in);
	
	static void printAboveAvg(int arr[], int n) 
    { 
          
        
        double avg = 0; 
        for (int i = 0; i < n; i++)  
            avg += arr[i];  
        avg = avg / n; 
      
        
        for (int i = 0; i < n; i++)  
            if (arr[i] > avg)  
                System.out.print(arr[i] + " "); 
        int a = arr.length; 
    } 
  
	
	public static void main(String[] args) {
		
		System.out.println("enter the elements");
        int a = sc.nextInt();
        int n[]= new int[a];
        for (int i = 0; i < n.length; i++) {
        	 int arr[] = { 5, 4, 6, 9, 10 }; 
        	
           printAboveAvg(arr, a)
           
		}
        
        		}

}
