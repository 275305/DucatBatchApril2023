package com.automation.pages;

import java.io.IOException;

public class ThrowsExample {
	
	
	void sum(int a, int b) throws ArithmeticException {
		
		
		
		int c = a/b;
		
		
	}
	
		
	public static void main(String[] args) {
		
		try {
		
		
		for(int i=1;i<=10;i++) {
			
			System.out.println(i);
			
		}
		
		ThrowsExample t=new ThrowsExample();
		  
		     t.sum(20, 0);
		     
		}
		catch(ArithmeticException e) {
			System.out.println(e);
	   }
	
	
	}

}
