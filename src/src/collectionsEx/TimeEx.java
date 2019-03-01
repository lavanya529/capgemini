package collectionsEx;

import java.util.ArrayList;
import java.util.LinkedList;

public class TimeEx {

	public static void main(String[] args) {
		
		ArrayList<Integer> aa = new ArrayList<Integer>();		
		//LinkedList<Integer> ll = new LinkedList<>();
		
		for (int i = 0; i < 10e5; i++) {
			//ll.add(i);
			aa.add(i);
			
		}
	   long	start = System.currentTimeMillis();
	   for (int i = 0; i < 10e5; i++) {
			//ll.add(i);
			aa.add(i);
			
		}
		long end= System.currentTimeMillis();
		
		System.out.println("Time taken ms:" +(end-start));
		
	}

}
