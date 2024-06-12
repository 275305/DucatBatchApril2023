package input.output.filehandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderExp {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the string and no:");

		String str = br.readLine();
		int a = Integer.parseInt(br.readLine());

		System.out.println("Entered no is:" + a);

		System.out.println(" entered string is :"+ str);

		/*
		 * String str = br.readLine();
		 * 
		 * System.out.println(str);
		 */

	}

}
