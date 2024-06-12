package polymorphism.oops;

public class HDFC extends Bank {

	public void interestRate(int a) {

		System.out.println(a*a);  // overriding

	}

	public void interestSum(int b, int c) {

		System.out.println(b*c); // overloading

	}

}
