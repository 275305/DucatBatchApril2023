package concept.of.java;

public class ObjectExample {
	
	
	
	String empName="Pradeep";
	String empID="Kell543";
	
	public static void getEmpDetails() {
		
		System.out.println(" Address is Sector 43, Gurgaon");
	}
	
	
	
	public static void main(String[] args) {
		
		ObjectExample obj = new ObjectExample();
		
		System.out.println(obj.empName);
		System.out.println(obj.empID);
		obj.getEmpDetails();
		
	}

}
