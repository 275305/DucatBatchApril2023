package concept.of.java;

public class OveridingTest {

	public static void main(String[] args) {

		OverridingVehicle vehicle = new OverridingVehicle();

		vehicle.engine();

		OverridingVehicle carObj = new OverridingCar();

		carObj.engine();
	}

}
