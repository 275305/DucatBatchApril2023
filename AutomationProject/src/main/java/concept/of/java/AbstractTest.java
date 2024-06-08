package concept.of.java;

public class AbstractTest extends AbstractEmployee {

	void addressEmp() {
		System.out.println(" Emp address is Gurgaon");
	}

	public static void main(String[] args) {
		
		AbstractTest obj = new AbstractTest();
		
		obj.addressEmp();

	}

}
