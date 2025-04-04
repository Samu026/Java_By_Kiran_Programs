/* Check Even odd number (Constructor with no Argument /Parameter) */

package com.program;

public class EvenOdd {
	public static void main(String[] args) {
		EvenOdd e = new EvenOdd();
	}

	public EvenOdd() {
		int n = 34;
		if (n % 2 == 0) {
			System.out.println(n + " is Even Number");
		} else {
			System.out.println(n + " is Odd Number");
		}
	}
}
