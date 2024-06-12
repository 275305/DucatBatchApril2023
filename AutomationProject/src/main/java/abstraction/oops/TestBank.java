package abstraction.oops;

public class TestBank extends Bank {
	
	public static void main(String[] args) {
		
		//Bank b=new Bank();// can not create the object
		
		TestBank obj = new TestBank();
		
	               obj.bankName();
	               obj.bankName();
	               obj.bankAddress();
	}

	@Override
	public void bankName() {
		System.out.println("this is Test Bank ");
		
	}

}
