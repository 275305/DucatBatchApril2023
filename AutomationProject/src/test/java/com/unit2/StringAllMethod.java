package com.unit2;

public class StringAllMethod {
	
	
	
	public static void main(String[] args) {
		
		  String s = "    I am learning Java at DataFlair!     ";
		  
		    
		    System.out.println("The output of s.length() is " + s.length());
		    System.out.println("The output of s.charAt(10) is " + s.charAt(11));
		    
		    System.out.println("The output of s.substring(4) is " + s.substring(11)); 
		    
		    System.out.println("The output of s.substring(5,10) is " + s.substring(11, 22));
		   
		    String s1 = "Data",
		    s2 = "Flair";
		    System.out.println("The output of s1.concat(s2) is " + s1.concat(s2)); 
		   
		    System.out.println("The output of s.indexOf('D') is " + s.indexOf("t"));
		   
		    System.out.println("The output of s.length() is " + s.length());
		    System.out.println("The output of s1.equals(s2) is " + s1.equals(s2));
		    System.out.println("The output of s1.compareTo(s2) is " + s2.compareTo(s1));
		    
		    String s3="Hello";
		    String s4="Hello";
		    
		     if (s3==s4) {
		    	 System.out.println("Both are same");
		     }
		     else
		     {
		    	 System.out.println("Both are not same");
		     }
		     
		     String s5=new String("Hello");
			    String s6=new String ("Hello");
			    
			    if (s5==s6) {
			    	 System.out.println("Both are same");
			     }
			     else
			     {
			    	 System.out.println("Both are not same");
			     }
			    
			    
		
	}

}
