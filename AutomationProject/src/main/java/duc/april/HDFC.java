package duc.april;

import org.openxmlformats.schemas.wordprocessingml.x2006.main.HdrDocument;

public class HDFC {
	
	
	public HDFC() {

		System.out.println("default constructor");

	}
	public HDFC(int a) {

		System.out.println(a*a);

	}
	public HDFC(int a, int b) {

		System.out.println(a+b);

	}
	
	public static void main(String[] args) {
		
		new HDFC();
		      /* new HDFC(10);
		       new HDFC(10,20);*/
		 
	}

}
