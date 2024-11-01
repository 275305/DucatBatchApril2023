package concept.of.java;

public class ThisExamp {
	
	String empName;
	
	int empId;
	
	
	public void getEmpData(String empName,int empId) {
		
		this.empName=empName;
		this.empId=empId;
		
	}
	
	public void display() {
		
		System.out.println(empName +" "+empId);
	}
	
	
	public static void main(String[] args) {
		
		
		 ThisExamp thObj = new ThisExamp();
		 
		 thObj.getEmpData("Pradeep", 101);
		 
		 thObj.display();
		
	}

}
