package basic.one.pmclass;

public class StaticBlockExm {
	
	static int a=20;
	
	//static block
	static {
		int a=10;
		
		System.out.println(" This is static block");
	}
	
	//method
	public void empID() {
		
		int b=122;
		
		
	}
	//consturctor
	StaticBlockExm(){
		
		int a=30;
	}
	
	
	public static void main(String[] args) {
		
		
		System.out.println(" This is main method");
	}

}
