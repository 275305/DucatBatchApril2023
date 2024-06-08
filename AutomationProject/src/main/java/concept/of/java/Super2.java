package concept.of.java;

public class Super2 extends Super1 {
	
	
	// define the constructor in child class
	public Super2() {
		super();
		System.out.println("This is the child class constructor");
		
	}
	
	void age() {
		
		System.out.println("This is age method of child class");
	}

	void emp() {
		super.name(); // calling the method of the super class
		System.out.println(super.habbit);// calling the variable of the super class
		age();
		
	}
	

}
