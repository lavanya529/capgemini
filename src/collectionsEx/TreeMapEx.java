package collectionsEx;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
		
		treeMap.put(103,"Jane");
		treeMap.put(102,"Alice");
		treeMap.put(101,"Bob");
		
		 for (Map.Entry m:treeMap.entrySet()) {
				
		    	System.out.println(m.getKey()+" "+m.getValue());
			}

	}

}
