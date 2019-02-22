package dateclass;

import java.util.Date;

public class DateModifiers {

	public static void main(String[] args) {

		Date d1 = new Date(2019,2,22);
		Date d2 = new Date();
		Date d3 = new Date(2018,2,23);
		
		boolean a = d3.after(d1);
		System.out.println("Date d3 comes after " +"date d2:" +a);
		
		 boolean b = d3.before(d2); 
	     System.out.println("Date d3 comes before "+ "date d2: " + b); 
	  
	        int c = d1.compareTo(d2); 
	        System.out.println(c); 
	  
	        System.out.println("Miliseconds from Jan 1 "+ 
	                "1970 to date d1 is " + d1.getTime()); 
	  
	        System.out.println("Before setting "+d2); 
	        d2.setTime(204587433443L); 
	        System.out.println("After setting "+d2); 
		
	}

}
