package concept.of.java;

public class FinallyExp {
	
	
	public static void main(String[] args) {
		
		
	int a=100,b=10,sum;
	
	
	try {
		
		sum=a/b;
	}
	catch(Exception e) {
		System.out.println(e);
	}
	
	finally {
		
		System.out.println(" it will be execute always");
	}
	}

}
