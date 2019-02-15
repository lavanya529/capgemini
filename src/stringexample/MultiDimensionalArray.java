package stringexample;

import java.util.Scanner;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int num;
			Scanner sc = new Scanner(System.in);

     System.out.println("enter rows and columns");
     int row= sc.nextInt();
     int col =sc.nextInt();
     int mat1[][] = new int[row][col];
     
     for (int i = 0; i < row; i++){
    	 for(int j=0;j<col;j++){
    		 System.out.println("enter the element : ");
    		 num = sc. nextInt();
    		 mat1[i][j] = num;
    	 }
		
	}
     for (int i = 0; i < row; i++){
    	 for(int j=0;j<col;j++){
    		 System.out.print(mat1[i][j]+" ");
    		 
     
	}
    	 System.out.println();

}
    
	}
	}
