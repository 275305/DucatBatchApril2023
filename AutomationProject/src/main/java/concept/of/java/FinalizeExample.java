package concept.of.java;

public class FinalizeExample {
	
	public void finalize() throws Exception
    {
        try {
 
            System.out.println("this is finalize()");
        }
        catch (Exception e) {
 
            throw e;
        }
        
    }
 
    
    public static void main(String[] args) throws Throwable
    {
 
       
    	FinalizeExample d = new FinalizeExample();
 
        // Calling finalize 
        d.finalize();
    }

}
