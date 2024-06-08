package overloading.oops;

public class Department {
	
	//1. by changing the parameter

	public void deptName(String deptName, int deptID) {
		
		System.out.println(deptName + " "+ deptID);

	}

	public void deptName(int deptID,String deptName) {
		
		System.out.println(deptName);

	}

		

	public static void main(String[] args) {
		
		Department d=new Department();
		d.deptName("IT",101);
		
	

	}
}
