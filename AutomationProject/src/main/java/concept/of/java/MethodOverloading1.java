package concept.of.java;

public class MethodOverloading1 {

	public void fruit(String FruitName, double FruitBox) {

		System.out.println( FruitName +   FruitBox);

	}
	public void fruit(String FruitName, int FruitQuantity) {

		System.out.println( FruitName + FruitQuantity);

	}

	public static void main(String[] args) {
		
		MethodOverloading1 m1=new MethodOverloading1();
		
		
		m1.fruit("Apple",20);
		m1.fruit("Orange",5.5);

	}

}
