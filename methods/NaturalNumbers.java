/* Write a method that takes an integer N and 
 * prints natural numbers from N TO 1. Call the method using the class name
 */

package com.methods;

public class NaturalNumbers {
	public static void main(String args[]) {
		NaturalNumbers.display(4);
	}
	public static void display(int N) {
		for(int i=1;N>=i;N--) {
			System.out.println(N);
		}
	}
}
