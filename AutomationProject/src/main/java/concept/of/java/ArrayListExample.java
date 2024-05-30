package concept.of.java;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
	
	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>();
		ArrayList<String> list2=new ArrayList<String>();
		
		list.add("abc");
		list.add("xyz");
		list.add("jkl");
		
		Iterator<String> itr = list.iterator();
		
		list2.add("raju");
		list2.add("vijay");
		
		list.addAll(list2);
		
		list.remove(0);
		list.remove("raju");
		
		//list.clear();  // to remove all the element
		
		//list.retainAll(list2);
		
		/*while(itr.hasNext()) {
		
			System.out.println(itr.next());
		}*/
		
		
		//for each loop
		for (String str:list) {
			System.out.println(str);
		}
		
		
	}

}
