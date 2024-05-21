package com.unit2;

public class VariableExample {
	
	int a=10;
	
	public VariableExample() {
		// TODO Auto-generated constructor stub
		int a =20;
		System.out.println("This is constructor: "+a);
	}
	
		
	public void method() {
		int a=40;
		System.out.println("This is method :"+a);
		
	}
	
	public static void main(String[] args) {
		VariableExample var=new VariableExample();
		var.method();
		
				
		System.out.println("Instance variable : "+var.a);
	}

}
