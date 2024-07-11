package duc.april;

import java.io.IOException;

public class ArrayAllExp {

	public static void main(String[] args) {

		try {
			int arr[] = { 10, 20, 30, 40 };

			for (int i = 0; i <= arr.length; i++) {
				System.out.println(arr[i]);
			}
			
			
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Finally will be execute allways even does not have any error !");
		}
		
	 /* catch (ArrayIndexOutOfBoundsException e) {

			System.out.println(e);
		} catch (ArithmeticException ae) {
			System.out.println(ae);
		} catch (Exception e) {
			System.out.println(e);
		}*/

		/*
		 * for(int number:arr) { System.out.println(number); }
		 */

		/*
		 * char arr[]= {'a','b','c','d'};
		 * 
		 * for (char arr1:arr) { System.out.println(arr1); }
		 */

		/*
		 * String arr[]= {"Gurgaon","Delhi","Jaipur"};
		 * 
		 * for(String str:arr) {
		 * 
		 * System.out.println(str); }
		 */

	}

}
