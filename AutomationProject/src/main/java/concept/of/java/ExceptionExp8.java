package concept.of.java;

public class ExceptionExp8 {
	
	
	
	public static void main(String[] args) {
		
		int a=100,b=0,sum;
		
		try {
		sum=a/b;
		
		System.out.println(sum);
		}
		
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
