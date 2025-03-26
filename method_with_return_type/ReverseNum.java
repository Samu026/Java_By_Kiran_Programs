/* Write a method that takes an integer and print its reverse. 
 * Call the method using the class name */

package com.method_with_return_type;

public class ReverseNum {
	public static void main(String args[]) {
		display(346);
	}

	public static int display(int num) {
		int reversed = 0;
		while (num != 0) {
			int digit = num % 10;
			reversed = reversed * 10 + digit;
			num = num / 10;
		}
		System.out.println("Reversed number: " + reversed);
		return num;

	}

}
