package concept.of.java;

public class FinalExp{
	
	int empID=103;
	
	public void empId() {
		empID=300;
		
		System.out.println(empID);
	}
	
	public static void main(String[] args) {
		
		FinalExp f=new FinalExp();
		f.empId();
	}

}
