package com.unit2;

import com.unit1.DefaultModifier;

public class DefaultModifier2 {

	
	public static void main(String[] args) {
		
		DefaultModifier def= new DefaultModifier();
		
		def.defaultClass();// it will give the compile time error! 
	}

	private static DefaultModifier DefaultModifier() {
		// TODO Auto-generated method stub
		return null;
	}
}
