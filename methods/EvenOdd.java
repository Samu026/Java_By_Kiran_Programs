/* Write a method that takes an integer as a parameters and 
 * prints whether it is Even or Odd, Call the method using the class name
 */

package com.methods;

public class EvenOdd {
	public static void main(String args[]) {
		EvenOdd.checkEvenOdd(97);
	}
	public static void checkEvenOdd(int a) {
		if(a%2==0) {
			System.out.println(a+" is Even Number");
		}else {
			System.out.println(a+" is Odd Number");
		}
	}
}
