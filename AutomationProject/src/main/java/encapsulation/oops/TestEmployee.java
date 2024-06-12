package encapsulation.oops;

public class TestEmployee {
	
	public static void main(String[] args) {
		
		Employee emp=new Employee();
		
		   emp.setEmpName("Ravi Prakash");
		   emp.setEmpID(10001);
		   
		   System.out.println(emp.getEmpID()+" "+emp.getEmpName());
		   
		
	}

}
