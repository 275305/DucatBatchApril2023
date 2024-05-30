package concept.of.java;

public class BreakExample {

	
	public static void main(String[] args) {
		int i,j;
		
		for(i=1;i<=3;i++) {
			
			for(j=1;j<=3;j++) {
				
				if(i==2 && j==2) 
				 break;
				//continue;
				System.out.print(i);
				System.out.println(j);
				
			}
		}
	}
}
