package superKeyword;



public class TestParentSuper extends ParentClassSuper {
	
	public TestParentSuper() {
		super.empAddress();
		
		System.out.println(super.empId +""+super.empName);
	}
	
	public static void main(String[] args) {
		
		new TestParentSuper();
		
		
	}

}
