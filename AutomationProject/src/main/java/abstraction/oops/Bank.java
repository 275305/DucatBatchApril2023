package abstraction.oops;

public abstract class Bank {
	
	
	public Bank() {
		System.out.println("This is abstract class");
	}
	public abstract void bankName();
	
	public final void bankAddress() {
		
		System.out.println(" Bank addess is Gurgaon ");
	}

}
