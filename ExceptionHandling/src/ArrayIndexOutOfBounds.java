/* Write a java program that creates an array of 5 elements and tries to 
 * access the 10th element. Use try-catch-finally to handle any exception.
 * Excepted: Catch ArrayIndexOutOfBoundsException.
  */

public class ArrayIndexOutOfBounds {
	public static void main(String[] args) {
		// int[] arr= new int[5];
		int arr[] = { 1, 2, 3, 4, 5 };

		try {
			System.out.println(arr[10]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array not Accesible");
		} finally {
			System.out.println("Done.....");
		}
	}
}
