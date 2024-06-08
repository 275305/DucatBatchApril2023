package overloading.oops;

public class ConstructorOverload {
	
	
	public ConstructorOverload(int a,int b) {
		 System.out.println(a+b);
	}
	
	public ConstructorOverload(int a,int b, int c) {
		 System.out.println(a+b+c);
	}
	public ConstructorOverload(int a,int b, int d,int e) {
		 System.out.println(a+b+d+e);
	}
	public ConstructorOverload(int c,int b, int f, int g, int h) {
		 System.out.println(c+b+f+g+h);
	}
	
	
	public static void main(String[] args) {
		/* new ConstructorOverload(10, 20);
		 new ConstructorOverload(10, 20, 30);
		 new ConstructorOverload(10,20,30,40);*/
		 new ConstructorOverload(10, 20, 30,40,50);
	}

}
