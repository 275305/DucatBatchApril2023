package thisKeyword;

public class ThisWithInstance {

	// if class instance same with local variable

	String empID;
	String empName;

	public ThisWithInstance(String empID, String empName) {
		
		this.empID = empID;
		this.empName = empName;
		
		
	}
	
	void empAddress() {
		System.out.println(" Gurgaon is empAddress");
	}
	
	void display() {
		this.empAddress();
		
		System.out.println(empID +""+empName);
	}

	
}
