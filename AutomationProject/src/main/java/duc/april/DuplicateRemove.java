package duc.april;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class DuplicateRemove {

	public static void main(String[] args) {

	

		int arr[] = { 10, 20, 20, 30, 10, 40, 30 };
		
		Set<Integer> set1=new HashSet<>();
		
		for(int i=0;i<arr.length;i++) {
			
			set1.add(arr[i]);
		}
		
		System.out.println(set1);
		
		  
			  
		

			/*
			Set<Integer> set1 = Arrays.stream(arr).boxed().collect(Collectors.toSet());
			
			System.out.println(set1);*/
		
		 
		

	}

}
