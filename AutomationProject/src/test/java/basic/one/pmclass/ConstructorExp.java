package basic.one.pmclass;

public class ConstructorExp {
	
	// what is java constructor
	
	ConstructorExp(){
		
		System.out.println(" i am default constructor");
		
	}
	
	ConstructorExp(String empName){
		
		System.out.println(empName);
	}
	
	public static void main(String[] args) {
		
		
		 new ConstructorExp();
		 
		 new ConstructorExp("Ramesh");
	}
	
	
	

}
