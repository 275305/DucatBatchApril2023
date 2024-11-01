
public class MethodOverloadEx {

	public void getEmpDetail(String empName) {

		System.out.println(empName);
	}

	public void getEmpDetail(int empId) {
		
		System.out.println(empId);

	}

	public static void main(String[] args) {

		MethodOverloadEx m = new MethodOverloadEx();

		m.getEmpDetail(102);
		m.getEmpDetail(" Pradeep");
	}

}
