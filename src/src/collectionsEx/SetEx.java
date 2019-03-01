package collectionsEx;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class SetEx {

	private static final List al = null;

	public static void main(String[] args) {

		HashSet<Integer> hashSet = new HashSet<>(); 
		hashSet.add(34);
		hashSet.add(14);
		hashSet.add(null);
		hashSet.add(14);
		hashSet.add(30);
		hashSet.add(00);
		Iterator<Integer> iterator =hashSet. iterator();
		while(iterator.hasNext()) {
		
			System.out.println(iterator.next());
		}
		
		
		

}
}