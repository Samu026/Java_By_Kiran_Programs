/* Write a method that prints "Hello, World!" when called. 
   Call the method using class name */

package com.method_with_return_type;

public class HelloWorld {
	public static void main(String args[]) {
		System.out.println(display("Hello World"));
	}
	public static String display(String msg) {
		return msg;
	}
}
