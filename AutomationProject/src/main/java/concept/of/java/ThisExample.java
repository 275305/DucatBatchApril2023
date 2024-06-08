package concept.of.java;

public class ThisExample {
	
	String name;
	int age;
	
	void m1() {
		System.out.println(" This is m1 method");
		
	}
	
	public ThisExample(String name, int age) {
		
		this.name=name;
		this.age=age;
	}
	
	void m2() {
		this.m1();
		
		System.out.println(name +""+age);
		
	}
	
	
	public static void main(String[] args) {
		
		
		ThisExample obj = new ThisExample("Ravi", 28);
		obj.m2();
		
	}

}
