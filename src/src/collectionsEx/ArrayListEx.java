package collectionsEx;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
		
		ArrayList<Integer> al1 = new ArrayList<>();
		al1.add(34);
		al1.add(20);
		
		
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(12);
		a1.add(23);
		a1.addAll(al1);
		
		System.out.println(a1);
        System.out.println(a1.get(2));
        
        ArrayList<String>  a2= new ArrayList<String>();
         
        a2.add("hello");
        System.out.println(a2);
        
        List a = new ArrayList<>();
        a.add("hello");
        a.addAll(al1);
        
        System.out.println(a);
        
        
	}

}
