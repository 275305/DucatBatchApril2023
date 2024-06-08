package concept.of.java;

public class ThrowExample {
	
	// user explicitly throw the exception
	void m1(int age) {
		
		
		if (age < 60) {
		
		throw new ArithmeticException("this person is not a senior citizen");
		}
		
		else
		{
			System.out.println("This is Senior citizen");
		}
	}
	
	
	public static void main(String[] args) {
		
		
		ThrowExample t = new ThrowExample();
		
		  t.m1(55);
	}

}
