/* Write a method that takes an integer and print its Cube
 * call the method using the Class name */

package com.methods;

public class Cube {
	public static void main(String args[]) {
		Cube.cubeNum(9);
	}

	public static void cubeNum(int num) {
		int cube = num * num * num;
		System.out.println("Cube of " + num + " is: " + cube);
	}
}
