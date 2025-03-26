/* Write a method that takes an integer and print its Cube
 * call the method using the Class name */

package com.method_with_return_type;

public class Cube {
	public static void main(String args[]) {
		showCube(90);
	}

	public static int showCube(int num) {
		int cube = num * num * num;
		System.out.println("Cube of " + num + " is: " + cube);
		return cube;
	}

}
