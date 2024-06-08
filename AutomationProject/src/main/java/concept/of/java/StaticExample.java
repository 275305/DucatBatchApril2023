package concept.of.java;

public class StaticExample {
	
	
	static String name="Pradeep";
	
	static void m1() {
		
		System.out.println("This is the static method");
	}
	
	static {
		
		System.out.println("This is the static block");
	}
	
	public static void main(String[] args) {
		
		StaticExample.m1();
		System.out.println(name);
		
		
		
		
	}

}
