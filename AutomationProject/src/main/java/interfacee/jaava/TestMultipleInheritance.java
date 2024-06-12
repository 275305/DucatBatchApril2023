package interfacee.jaava;

public class TestMultipleInheritance implements Student, Teacher {

	public static void main(String[] args) {
		
	TestMultipleInheritance test=new TestMultipleInheritance();
	
	test.teacherName();
	test.studentName();

	}

	public void teacherName() {
		System.out.println("This is teacher");

	}

	public void studentName() {
		System.out.println("This is student");
	}

}
