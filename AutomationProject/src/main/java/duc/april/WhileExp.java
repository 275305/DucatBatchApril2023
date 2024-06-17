package duc.april;

import java.util.Scanner;

public class WhileExp {
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the number");
		long n=sc.nextLong();
		
		long sum=0,rem;
		
		while(n>0) {
			 
			rem=n%10;
			sum=(sum*10)+rem;
					
			n=n/10; 
			
					
		}
		
		System.out.print (sum);
		
	}
	
	
	

}
