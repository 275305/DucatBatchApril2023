package duc.april;

public class Bank {

	public int intrestCal(int a) {
		
		return a;

	}

	public double intrestCal(double a , double b) {
		
		return a+b;

	}
	
	
	public static void main(String[] args) {
		
		Bank b=new Bank();
		
		 System.out.println(b.intrestCal(10));
		 System.out.println(b.intrestCal(20.50, 30.50));
		
		
		
	}

}
