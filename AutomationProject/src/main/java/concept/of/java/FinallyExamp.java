package concept.of.java;

public class FinallyExamp {
	
	
	
	public static void main(String[] args) {
		
		int a=100,b=10,result;
		
		
		try {
		
		result=a/b;
		
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		
		
		finally {
			
			System.out.println("I will be execute always");
		}
		
		
	}
	
	
	
	
	

}
