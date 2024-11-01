package basic.one.pmclass;

public class StaticandNonStaticExp {
	
	
	
	// this is non static method
	public void empName() {
		
		System.out.println(" This is not static method");
		
	}
	
	public static void empAddress() {
		System.out.println(" This is static method");
	}
	
	public static void main(String[] args) {
		
		StaticandNonStaticExp obj = new StaticandNonStaticExp();
		
		    obj.empName();
		    StaticandNonStaticExp.empAddress();
		
	}

}
