package input.output.filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadFileMethod2 {

	
	
	public static void main(String[] args) throws IOException {
		
		File file=new File("C:\\Users\\pradeep.chauhan\\Desktop\\QA.txt");
		  
		//working fine
		BufferedReader br=new BufferedReader(new FileReader(file));
		
	      String str;
	      	      
	      while((str=  br.readLine()) !=null) {
	    	  
	    	  System.out.println(str);
	      }
		
		
		
		
		
		
		 
		/*
		String st=sc.toString();
		 char[]arr=  st.toCharArray();
		 
		 for(int i=0;i<arr.length;i++) {
			 
			 if(arr[i]!='\0') {
				
				 System.out.print(arr[i]);
			 }
		 }*/
		 
		 /* for(char c: arr) {
			  System.out.println(c);
		  }
		    */       
		
		
	}
}
