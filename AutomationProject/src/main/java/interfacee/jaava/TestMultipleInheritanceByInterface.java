package interfacee.jaava;

public class TestMultipleInheritanceByInterface implements BikeInterface {

	public void carInterface() {

		System.out.println(" This is car interface");

	}

	public void bikeInterface() {

		System.out.println(" This is bike interface");
	}

	public static void main(String[] args) {
		
		TestMultipleInheritanceByInterface test=new TestMultipleInheritanceByInterface();
		test.bikeInterface();
		test.carInterface();

	}

}
