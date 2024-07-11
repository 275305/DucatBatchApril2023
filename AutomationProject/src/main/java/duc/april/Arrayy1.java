package duc.april;

public class Arrayy1 {
	
	
	
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4};
		int arr2[];
		
		int arr1[] =new int[5];
		
		char chararr[]= {'a','b','c','d'};
		
		char charr[]=new char[5];
		
		String str[];
		String str1[]=new String[10];
		String str2[]= { "Ravi","Mohan","Vijay"};
		
		for(int i=0;i<4;i++) {
			System.out.println(chararr[i]);
		}
		
		
		for(int i=0;i<4;i++) {
			System.out.println(arr[i]);
		}
		
		for(String s1:str2) {
			System.out.println(s1);
		}
		
	}

}
