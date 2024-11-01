package concept.of.java;

public class ThisExp {
	
	String empName;
	int empID;
	
	public void getEmp(String empName,	int empID) {
		
		empName=empName;
		empID=empID;
		
	}
	
	public void display() {
		
		System.out.println(empName + " "+empID);
	}
	
	public static void main(String[] args) {
		
		ThisExp obj=new ThisExp();
		obj.getEmp("Pradeep", 102);
		obj.display();
		
	}
	
	

}
