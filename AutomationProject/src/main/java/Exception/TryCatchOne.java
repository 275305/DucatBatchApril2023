package Exception;

public class TryCatchOne {
	   public static void main(String[] args) {  
	        try  
	        {  
	        int data=50/0; //may throw exception   
	        }  
	             // handling the exception  
	        catch(Exception e)  
	        {  
	                  // displaying the custom message  
	            System.out.println("Can't divided by zero");  
	        } 
	        
	        finally {
	        	System.out.println("This is finally block");
	        }
	    }  

}
