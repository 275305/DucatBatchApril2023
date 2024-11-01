package basic.one.pmclass;

public class JavaClass {
	
	
	int a=10;
	String name="Ravi";
	
	
	// how to call method from main method
	public String empName() {
		
		System.out.println("My Name is Ravi");
		return null;
		
	}
	
	
	
	public void empAddress() {
		
		System.out.println(" My address is Gurgaon");
	}
	
	public static void main(String[] Vijay) {
	
		  JavaClass javaObj = new JavaClass();
		  
		  javaObj.empName();
		  javaObj.empAddress();
		
	}

}
