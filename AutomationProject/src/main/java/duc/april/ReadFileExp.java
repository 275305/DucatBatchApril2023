package duc.april;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadFileExp {
	
	public static void main(String[] args) {
		
		File file=new File("");
		
		try {
			BufferedReader br=new BufferedReader(new FileReader(file));
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
	}

}
