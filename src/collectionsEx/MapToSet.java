package collectionsEx;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapToSet {
	
	static  Map<Integer,String> getMap(){

        HashMap<Integer, String> hashMap=new HashMap<Integer,String>();
        hashMap.put(1,"Sunday");
        hashMap.put(2,"Monday");
        hashMap.put(3,"Tuesday");
        hashMap.put(4,"Wednesday");

	
		
		return hashMap;
		
	}

	public static void main(String[] args) {
		
		//HashMap<Integer, String>  hashMap = new HashMap<Integer, String>();

		
	    
		
		Map<Integer,String> map= getMap();

        
        Set<Integer> keySet= new HashSet<Integer>(map.keySet());
        keySet.forEach(key-> System.out.println(key));

       
        Set<String> valueSet= new HashSet<String>(map.values());
        valueSet.forEach(value-> System.out.println(value));

		HashSet<Integer> hashSet = new HashSet<>(); 
		

	}

}
