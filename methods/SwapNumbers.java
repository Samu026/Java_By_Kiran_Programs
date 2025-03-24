/* Write a method that takes two numbers as parameters and swaps them without 
 * returning anything. Call the method using the class name */

package com.methods;

public class SwapNumbers {
	public static void main(String args[]) {
		SwapNumbers.swap(10, 20);
	}
	public static void swap(int a, int b) {
		int temp=0;
		System.out.println("Before Swap a :"+a);
		System.out.println("Before Swap b :"+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("After Swap a :"+a);
		System.out.println("After Swap b :"+b);
	}
}
