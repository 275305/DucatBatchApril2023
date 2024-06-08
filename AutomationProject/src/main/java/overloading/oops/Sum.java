package overloading.oops;

public class Sum {

	public int sum(int a, int b) {
		return a + b;

	}

	public int sum(int a, int b,int c) {
		return a + b+c;

	}

	public float sum(float a, float b) {
		return a+b;

	}
	
	public static void main(String[] args) {
		
		Sum s=new Sum();
		
	
		
		System.out.println(s.sum(101, 201));
		System.out.println(s.sum(100, 200, 300));
		System.out.println(s.sum(100.50f, 200.50f));
		
	}

}
