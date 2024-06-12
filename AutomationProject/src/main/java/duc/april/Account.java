package duc.april;

public abstract class Account {
	
	static String AccountName="Pratibha Account";
	
	public Account() {
		
		System.out.println(" This is abstract class");
	}
	
	
	public abstract void accountNumber();
	public abstract void accountAddress();
	public abstract void accountIFSC();
	
	public static void bankCode() {
		System.out.println(" Bank code is BANK0003");
	}
}
