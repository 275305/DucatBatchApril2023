package concept.of.java;

public class StringExample {
	
	public static void main(String[] args) {
		
		// string Lateral immutable -storing into SCP area
		String s="pradeep";
		s.concat("kumar");
		System.out.println(s);
		
		// string with new keyword immutable -storing in heap area
		String s1=new String("ramu");
		s1.concat("singh");
		System.out.println(s1);
		
		
		//string buffer example mutable 
		
		StringBuffer s2=new StringBuffer("Ravi");
		s2.append("prakash");
		System.out.println(s2);
		
		//string builder example mutable
		
		StringBuilder s3=new StringBuilder("Vijay");
		  s3.append("Raj");
		 System.out.print(s3);
		  
				
	}

}
