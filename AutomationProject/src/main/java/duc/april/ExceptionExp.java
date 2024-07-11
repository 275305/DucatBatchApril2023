package duc.april;

public class ExceptionExp {
	
	
	public static void ageEmployee(int ageEmployee) {
		
		if (ageEmployee <18) {
			
			throw new ArithmeticException(" This employee is not valid for the Voting");
			
		}
		else
		{
			System.out.println("Eligible for voting");
		}
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		ExceptionExp.ageEmployee(17);
		
		
		
		
	}

}
