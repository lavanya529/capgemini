package collectionsEx;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		
		hashMap.put(101,"Bob");
	    hashMap.put(102, "Alice");
	    hashMap.put(103, "Jane");
	    
	    for (Map.Entry m:hashMap.entrySet()) {
		
	    	System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
