package duc.april;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ListExample {

	
	// map and hash table different 
	
	public static void main(String[] args) {

		//List<Integer> list = new ArrayList();
		
		Set set=new HashSet();

		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(10);
		

		/*
		 * System.out.println(list); System.out.println(list.get(3));
		 */

		Iterator<Integer> itr = set.iterator();
		
		 while( itr.hasNext()) {
			 
			 System.out.println(itr.next());
		 }

	}

}
