package concept.of.java;

public class TryCatchExample {
	
	
	public static void main(String[] args) {
		 int a=10, b=0,c;
		
		try {
			
			
			c=a/b;
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println(" This is the try-catch program");
	}

}
