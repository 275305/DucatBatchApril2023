package concept.of.java;

public class StaticExamp {
	
	
	static String empName="Pradeep";
	
	
	public static void getData() {
		
		System.out.println(" This is static method");
	}
	
	
	
	
	public static void main(String[] args) {
		
		
		System.out.println(StaticExamp.empName);
		
		StaticExamp.getData();
		
	}

}
