package concept.of.java;

public class ConstructorExp5 {
	
	
	// default constructor
	
	public ConstructorExp5() {
		
		
		System.out.println(" hello every one i want to execute consturctor at the time of object creation");
		
	}
	
	// 2 paremeterrized constructor
	
	ConstructorExp5( String name, int id){
		
		System.out.println(name + " "+ id);
	}
	
	
	
	public static void main(String[] args) {
		
		ConstructorExp5 b = new ConstructorExp5();
		
		ConstructorExp5 ab = new ConstructorExp5("Pradeep", 1045);
		
		
		
		
	}
	

}
