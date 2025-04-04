/*Print Square and cube (Constructor with no Argument /Parameter) */

package com.program;

public class SquareCube {
	public static void main(String[] args) {
		SquareCube s = new SquareCube();
	}

	public SquareCube() {
		int n = 5;
		int square = n * n;
		System.out.println("Square of " + n + " is: " + square);
		int cube = n * n * n;
		System.out.println("Cube of " + n + " is: " + cube);
	}
}
