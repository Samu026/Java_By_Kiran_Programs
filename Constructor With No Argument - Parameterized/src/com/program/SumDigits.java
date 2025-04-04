/* Find sum of digits in number (Constructor with no Argument /Parameter) */

package com.program;

public class SumDigits {
	public static void main(String[] args) {
		SumDigits s = new SumDigits();
	}

	public SumDigits() {
		int n = 765;
		int sum = 0;
		while (n != 0) {
			int rem = n % 10;
			n = n / 10;
			sum = rem + sum;
		}
		System.out.println(sum);
	}
}
