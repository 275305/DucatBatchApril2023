package JavaBatch1pm;

public class FirstJavaProgram {
	
	
	// non static 
	public void empName() {
		
		System.out.println(" This is empName ");
	}
	
	//static method
	// this is static method 
	
/*	this is 
	static 
	method */
	
	public static void empID() {
		
		System.out.println(" EMP id is Ducat1234 ");
		
		
		System.out.println(" This is message");
	}
	
	
	
	
	public static void main(String[] args) {
		
	  	  FirstJavaProgram obj = new FirstJavaProgram();
	  	  
	  	  obj.empName();
	  	  FirstJavaProgram.empID();
	  	  
		
		
	}

}
