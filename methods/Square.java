/* Write a method that takes an integer and print its Square
 * call the method using the Class name */

package com.methods;

public class Square {
	public static void main(String args[]) {
		Square.squareNum(90);
	}

	public static void squareNum(int num) {
		int square = num * num;
		System.out.println("Square of " + num + " is: " + square);
	}
}
