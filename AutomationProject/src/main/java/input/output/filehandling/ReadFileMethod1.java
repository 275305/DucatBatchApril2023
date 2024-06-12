package input.output.filehandling;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadFileMethod1 {
	
public static void main(String[] args) throws IOException {
		
		File file=new File("C:\\Users\\pradeep.chauhan\\Desktop\\QA.txt");
		 List<String> list=new ArrayList<String>();
			Scanner sc=new Scanner(file);
			sc.useDelimiter("&&");
			
			while(sc.hasNext()) {
				String str= sc.next();
				list.add(str);
				//System.out.println(list);
				
				for(String l:list) {
					System.out.println(l);
				}
				
			}
			
			sc.close();
}

}
