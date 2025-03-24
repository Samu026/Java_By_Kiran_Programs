/* Write a method that takes two integers as parameters and prints their sum.
 * call the method using the class name.*/

package com.methods;

public class Sum {
	public static void main(String args[]) {
		Sum.displaySum(60, 97);
	}

	public static void displaySum(int a, int b) {
		int c = a + b;
		System.out.println("Sum of two integer :" + c);
	}
}
