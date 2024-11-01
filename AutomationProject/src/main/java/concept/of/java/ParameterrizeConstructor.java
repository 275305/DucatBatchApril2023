package concept.of.java;

public class ParameterrizeConstructor {
	
	public ParameterrizeConstructor(String empName, int empId) {
		
		System.out.println(empName+" " + empId);
		
		
	}
	public static void main(String[] args) {
		
		new ParameterrizeConstructor("Pradeep", 1234);
		
	}

}
