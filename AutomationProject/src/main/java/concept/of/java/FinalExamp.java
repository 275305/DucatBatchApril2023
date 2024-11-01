package concept.of.java;

public class FinalExamp {
	
	
	int empID=101;
	
	
	public void getEmpId() {
		empID=200;
		
		System.out.println(empID);
		
		
	}
	
	public static void main(String[] args) {
		
		FinalExamp fObje = new FinalExamp();
		
		fObje.getEmpId();
		
		
	}

}
