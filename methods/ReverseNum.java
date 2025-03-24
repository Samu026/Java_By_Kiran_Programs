/* Write a method that takes an integer and print its reverse. 
 * Call the method using the class name */

package com.methods;

public class ReverseNum {
	public static void main(String args[]) {
		ReverseNum.show(123);
	}

	public static void show(int num) {
		int reversed = 0;
		while (num != 0) {
			int digit = num % 10;
			reversed = reversed * 10 + digit;
			num = num / 10;
		}
		System.out.println("Reversed Numbers is: " + reversed);
	}
}
