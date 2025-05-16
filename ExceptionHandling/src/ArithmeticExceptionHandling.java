/* Write a Java Program that takes two numbers from the user and divides them.
 * Handle the exception if he second number is zero using try-catch-finally.
 * Excepted: Catch ArithmeticException, and print a message like "Cannot divide 
 * by zero".
 */

import java.util.Scanner;

public class ArithmeticExceptionHandling {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter First Number: ");
		int a = sc.nextInt();

		System.out.println("Enter Second Number: ");
		int b = sc.nextInt();
		try {
			System.out.println(a / b);
		} catch (ArithmeticException e) {
			// e.printStackTrace();
			System.out.println("Cannot divide by zero");
		} finally {
			System.out.println("Done.....");
		}

		sc.close();

	}
}
