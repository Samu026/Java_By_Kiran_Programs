/* Write a method that takes two integers as parameters and prints their sum.
 * call the method using the class name. */

package com.method_with_return_type;

public class Sum {
	public static void main(String args[]) {
		int sum = calculateSum(6, 7);
		System.out.println("Sum: " + sum);
	}

	public static int calculateSum(int a, int b) {
		int c = a + b;
		return c;
	}
}
