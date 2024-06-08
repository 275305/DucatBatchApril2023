package com.automation.pages;

public class ConstructorExp {
	
	
	
	public ConstructorExp() {
    
		System.out.println(" this is defalt constructor");

	}
	
		
	
	void m1() {
		System.out.println("hello");
	}
	
 /*ConstructorExp( String empName, String empAddress){
		
		System.out.println(empName + ""+ empAddress);
		
		System.out.println(" hello");
		
		
	}*/
 
 public static void main(String[] args) {
	
	new ConstructorExp();
	 
}
	

}
