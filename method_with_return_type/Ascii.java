/* Write a method that takes a character and prints its ASCII Value. 
 * call the method using class name */

package com.method_with_return_type;

public class Ascii {
	public static void main(String args[]) {
		show('$');
	}

	public static char show(char alphabet) {
		System.out.println("ASCII Value: " + (int) alphabet);
		return alphabet;
	}
}
