/* Write a method that takes an integer N and 
 * prints natural numbers from N TO 1. Call the method using the class name
 */

package com.method_with_return_type;

public class NaturalNumbers {
	public static void main(String args[]) {
		display(20);
	}

	public static int display(int num) {
		for (int i = 1; i <= num; num--) {
			System.out.println(num);
		}
		return num;
	}
}
