/* Write a method that takes an integer N and prints number from 1 to N
 * call the method using the class name */

package com.methods;

public class NumberSeries {

	public static void main(String args[]) {
		NumberSeries.displayNumber(17);
	}
	public static void displayNumber(int N) {

		for(int i=1;i<=N;i++) {
			System.out.println(i);
		}
	}
}
