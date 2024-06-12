package input.output.filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileMethod1 {

	
	public static void main(String[] args) throws IOException {
		
		
		File file=new File("C:\\Users\\pradeep.chauhan\\Desktop\\QA2.txt");
		
		FileWriter fileWrite = null;
		try {
			fileWrite=new FileWriter(file);
			
			fileWrite.write("Hello  all,  Java and Python are the very popular Language in the world" );
			 System.out.println(" content Written successfully");
			
		     } 
		
		catch(IOException e) {
			e.printStackTrace();
		             }
		fileWrite.close();
		
		/*finally {
			try {
			fileWrite.close();
			   }
			catch(IOException e1) {
				e1.printStackTrace();
			}*/
		
		//}
		
	}
}
