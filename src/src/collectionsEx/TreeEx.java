package collectionsEx;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeEx {

	public static void main(String[] args) {
		
		TreeSet<Integer> treeSet = new TreeSet<>();
		
		treeSet.add(10);
		treeSet.add(12);
		treeSet.add(17);
		treeSet.add(25);
		treeSet.add(12);
		//treeSet.add(null); in treeset it will not accept the null value
		treeSet.add(5);
		treeSet.add(6);
		treeSet.add(0);
		Iterator<Integer> iterator= treeSet.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		

	}

}
