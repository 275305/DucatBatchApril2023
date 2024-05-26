package com.automation.pages;

public class MethodOverloading1 {

	public void fruit(String FruitName) {

		System.out.println("Fruit Name :" + FruitName);

	}
	public void fruit(String FruitName, int FruitQuantity) {

		System.out.println("Fruit Quantity KG :" + FruitQuantity);

	}

	public static void main(String[] args) {
		
		MethodOverloading1 m1=new MethodOverloading1();
		
		
		m1.fruit("Apple",20);
		m1.fruit("Orange");

	}

}
