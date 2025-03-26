/* Write a method that takes an integer as a parameter and print 
 * whether it is positive, Negative, zero. 
 * call the method using the class name */

package com.method_with_return_type;

public class TypesNum {
	public static void main(String args[]) {
		displayType(-2);
	}

	public static float displayType(int num) {
		if (num > 0) {
			System.out.println("Positive Number: " + num);
		} else if (num < 0) {
			System.out.println("Negative Number: " + num);
		} else if (num == 0) {
			System.out.println("Number: " + num);
		} else {
			System.out.println("Invalid Input");
		}
		return num;
	}

}
