package polymorphism.oops;

public class CompleTimeOverLoad2 {

	int sum(int a, int f) {
		return a + f;

	}

	float sum(float a, int b) {

		return a + b;
	}

	double sum(double a, int b) {

		return a + b;
	}

	public static void main(String[] args) {

		CompleTimeOverLoad2 r = new CompleTimeOverLoad2();

		System.out.println(r.sum(10, 20));
		System.out.println(r.sum(10f, 20));
		System.out.println(r.sum(10.50, 30));

	}

}
