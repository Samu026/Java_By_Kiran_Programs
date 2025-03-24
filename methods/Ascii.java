/* Write a method that takes a character and prints its ASCII Value. 
 * call the method using class name */

package com.methods;

public class Ascii {

	public static void main(String args[]) {
		Ascii.show('S');
	}
	public static void show(char alphabet) {
		System.out.println("ASCII :"+ (int)alphabet);
	}
}
