package concept.of.java;

public class StaticExp {
	
	static String name="Ravi";
	
	public static void getData() {
		
		System.out.println("This is Gurgaon");
		
	}
	
	public static void main(String[] args) {
		 
		System.out.println(StaticExp.name);
		
		StaticExp.getData();
		
		
	}
	

}
