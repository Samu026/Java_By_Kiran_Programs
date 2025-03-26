/* Write a method that takes two numbers as parameters and swaps them without
 * returning anything. Call the method using the class name */

package com.method_with_return_type;

public class SwapNumbers {
	public static void main(String args[]) {
		swap(9, 8);
	}

	public static void swap(int a, int b) {
		System.out.println("Before swap a is: " + a);
		System.out.println("Before swap b is: " + b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("After swap a is: " + a);
		System.out.println("After swap b is: " + b);

	}
}
