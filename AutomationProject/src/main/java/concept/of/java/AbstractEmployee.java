package concept.of.java;

public abstract class AbstractEmployee {
	
	// create the constructor in abstract class but cant create the object in abstract class
	
	
	AbstractEmployee(){
		
	}
	
	// method should be private , protected and public
	public void nameEmp() {
		System.out.println("Emp name is Pradeep");
	}
	
	abstract void addressEmp();
	
	
	

}
