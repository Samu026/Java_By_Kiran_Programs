/* Write a method that takes an integer and prints its multiplication 
 * table up to 10. Call the method using the class name 
 */

package com.method_with_return_type;

public class Table {
	public static void main(String args[]) {
		displayTable(3);
	}

	public static int displayTable(int num) {

		for (int i = 1; i <= 10; i++) {
			int result = num * i;
			System.out.println(result);
		}
		return num;

	}
}
