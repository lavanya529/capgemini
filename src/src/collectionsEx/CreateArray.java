package collectionsEx;

import java.util.ArrayList;
import java.util.List;

public class CreateArray {

	public static void main(String[] args) {
	
		List animals = new ArrayList();
		
		animals.add("Harry");
		animals.add(10.1);
		animals.add(100);
		animals.add("potter");
		
		System.out.println(animals);
		System.out.println(animals.get(2));
		
		animals.add(2,"elephant");
		
		System.out.println(animals);
		System.out.println(animals.get(2));

	}

}
