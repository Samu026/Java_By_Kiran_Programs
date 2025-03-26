/* Write a method that takes an integer N and prints number from 1 to N
 * call the method using the class name */

package com.method_with_return_type;

public class NumberSeries {
	public static void main(String args[]) {
		show(20);
	}

	public static int show(int num) {
		for (int i = 1; i <= num; i++) {
			System.out.println(i);
		}
		return num;
	}
}
