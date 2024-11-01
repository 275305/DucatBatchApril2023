package concept.of.java;

public class ThrowExp {
	
	public static void test(int age)  {
		
		if (age<18) {
			
			throw new ArithmeticException("not eligible for Vote");
			
		}
		else {
			
			System.out.println("applicable for election");
			
		}
		
		
	}
	
	
	public static void main(String[] args)  {
		
		test(20);
		
		
	}

}
