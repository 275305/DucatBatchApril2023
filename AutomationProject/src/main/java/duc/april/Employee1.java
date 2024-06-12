package duc.april;

public class Employee1 extends Department {

	public void deptName(String deptName) {

		System.out.println(" This is Employee class");

	}

	public static void main(String[] args) {
		
		/*
		Employee1 e1=new Employee1();
		 e1.deptName(" IT Department");*/
		 Department d=new Department();
		  d.deptName(" Department class");

	}
}
