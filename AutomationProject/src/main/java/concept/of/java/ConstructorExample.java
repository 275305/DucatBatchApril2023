package concept.of.java;

public class ConstructorExample {
	

	private String name;
	private int age;
	

	public ConstructorExample(String name, int age) {

            this.name=name;  
            this.age=age;
            
            System.out.println(name + age);
	}
	
	
	public static void main(String[] args) {
		
		new ConstructorExample("Rahul",28);
	}
	
	

}
