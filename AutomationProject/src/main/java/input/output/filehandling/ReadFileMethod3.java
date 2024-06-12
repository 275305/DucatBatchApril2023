package input.output.filehandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadFileMethod3 {
	
	// most use full and easy method
	public static void main(String[] args) throws IOException {
		
	Path path =Paths.get("C:\\Users\\pradeep.chauhan\\Desktop\\QA.txt");
	
	    List<String> lines=Files.readAllLines(path);
	    
	     for(String str: lines) {
	    	 System.out.println(str);
	     }
		
	}

}
