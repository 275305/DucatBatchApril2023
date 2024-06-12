package arrayJava;

public class ArrayExp {

	public static void main(String[] args) {

		// int arr[]=new int[10];

		int arr[] = { 10, 20, 30, 40 };
		char arr1[] = { 'a', 'b', 'c' };
		String arr2[] = { "ravi", "vijay", "raju" };

		for (int k = 0; k <= 3; k++) {

			System.out.print(" " + arr[k]);
		}

		System.out.println("");
		for (int i : arr) {
			System.out.print(" " + i);
		}

		System.out.println("");
		for (char c : arr1) {
			System.out.print(" " + c);
		}

		System.out.println(" ");

		for (String s : arr2) {
			System.out.println(s);
		}

	}

}
