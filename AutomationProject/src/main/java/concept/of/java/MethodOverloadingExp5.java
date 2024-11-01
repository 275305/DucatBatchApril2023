package concept.of.java;

public class MethodOverloadingExp5 {

	public void getEmpDetails(String empName) {

		System.out.println(empName);

	}

	public void getEmpDetails(String empName,int empID) {

		System.out.println(empName+" "+empID);

	}

	public static void main(String[] args) {

		MethodOverloadingExp5 obj = new MethodOverloadingExp5();

		obj.getEmpDetails(" Pradeep");
		obj.getEmpDetails("Chauhan", 1056);

	}

}
