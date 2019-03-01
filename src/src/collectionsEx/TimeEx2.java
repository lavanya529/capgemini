package collectionsEx;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class TimeEx2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> ll = new ArrayList<Integer>();
		
		LinkedList<Integer> aa = new LinkedList<Integer>();
		
		for (int i = 0; i < 10e5; i++) {
			
			aa.add(i);
			
			}
		long start = System.currentTimeMillis();
  // check once Iterator<Integer> iterator = new Iterator();
		for (int i = 0; i < 100e5; i++) {
			
			aa. add( (int) (10e5/2), i);
			
		}
		long end = System.currentTimeMillis();
	System.out.println(aa);
	}
}
