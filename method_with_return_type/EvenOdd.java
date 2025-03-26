/* Write a method that takes an integer as a parameters and 
 * prints whether it is Even or Odd, Call the method using the class name
 */

package com.method_with_return_type;

public class EvenOdd {
	public static void main(String args[]) {
		EvenOdd.CheckEvenOdd(22);
	}

	public static int CheckEvenOdd(int num) {
		if (num % 2 == 0) {
			System.out.println(+num + " is Even");
		} else {
			System.out.println(+num + " is Odd");
		}
		return num;
	}

}
