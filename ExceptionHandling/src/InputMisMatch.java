/*Accept integer input from the user using Scanner. 
 * If the user enters a string instead of a number, handle it using try-catch.
 * 🔹 Catch InputMismatchException.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMisMatch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number :");
		try {
			int num = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Invalid Imput Please enter number value");
		}

	}
}
