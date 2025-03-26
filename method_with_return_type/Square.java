/* Write a method that takes an integer and print its Square
 * call the method using the Class name */

package com.method_with_return_type;

public class Square {
	public static void main(String args[]) {
		showSquare(90);
	}

	public static int showSquare(int num) {
		int square = num * num;
		System.out.println("Square of " + num + " is: " + square);
		return square;
	}

}
