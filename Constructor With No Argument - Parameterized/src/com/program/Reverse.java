/* Reverse Number (Constructor with no Argument /Parameter) */

package com.program;

public class Reverse {
	public static void main(String[] args) {
		Reverse r = new Reverse();
	}

	public Reverse() {
		int n = 123;
		int rev = 0;
		while (n != 0) {
			int rem = n % 10;
			rev = rev * 10 + rem;
			n = n / 10;
		}
		System.out.println(rev);

	}
}
