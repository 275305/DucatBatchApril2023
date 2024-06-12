package polymorphism.oops;

public class CompletimeOverLoad {

	public int sum(int a, int b) {

		return a+b;

	}

	public int sum(int a, int b, int c) {

		return a +b +c;

	}

	public int sum(int a, int b, int c,int d) {

		return a+b+c+d;

	}
	public static void main(String[] args) {
		
		CompletimeOverLoad c=new CompletimeOverLoad();
		  
		System.out.println("Sum of two number " +c.sum(100, 200));
		System.out.println("Sum of three number " +c.sum(100, 200,300));    
	}
}
