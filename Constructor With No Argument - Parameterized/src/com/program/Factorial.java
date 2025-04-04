/* Find Factorial(Constructor with no Argument /Parameter) */

package com.program;

public class Factorial {
	Factorial() { // Another way of creating constructor without access specifier
		int fact = 1;
		int n = 10;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + n + " is: " + fact);
	}

	public static void main(String[] args) {
		Factorial f = new Factorial();
	}
}
