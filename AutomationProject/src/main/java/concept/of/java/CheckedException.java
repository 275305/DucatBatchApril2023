package concept.of.java;

public class CheckedException {
	
	
	
	public static  void checkException(int a, int b) {
		
	
		
		int sum;
		
		sum=a/b;
		
		System.out.println(sum);
		
		//throw new AirthmeticException("can not devide the 100");
		
	 throw new ArithmeticException("\nNumber is negative, cannot calculate square");
		
	}
	
	
	
	public static void main(String[] args)  {
		
		
		checkException(100,0);
		
		
		}
		
		
		
		
		
	
	

}
