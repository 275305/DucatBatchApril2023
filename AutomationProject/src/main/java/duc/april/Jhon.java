package duc.april;

public class Jhon extends Account{

	@Override
	public void accountNumber() {
		System.out.println(" account no");
		
	}

	@Override
	public void accountAddress() {
		System.out.println(" account address");
		
	}

	@Override
	public void accountIFSC() {
		System.out.println(" account ifsc");
		
		
	}
	
	public static void main(String[] args) {
		
		 
		
		Jhon j=new Jhon();
		j.accountAddress();
		j.accountIFSC();
		j.accountNumber();
		
		Account.bankCode();
		System.out.println(Account.AccountName);
	}
	
	
	

}
