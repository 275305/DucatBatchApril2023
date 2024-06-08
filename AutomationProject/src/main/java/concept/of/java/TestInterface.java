package concept.of.java;

public class TestInterface implements InterfaceExample{
	
	
	
	public static void main(String[] args) {
		
		TestInterface obj = new TestInterface();
		obj.nameEmp();
		obj.addressEmp();
		
	}

	public void nameEmp() {
		
		System.out.println(" Emp name is Pradeep");
		
	}

	public void addressEmp() {
		
		System.out.println("Emp address is Gurgaon");
		
	}

}
