/* Write a method that takes an integer and prints its multiplication 
 * table up to 10. Call the method using the class name 
 */

package com.methods;

public class Table {
	
	public static void main(String args[]) {
		Table.tableMul(12);
	}
	public static void tableMul(int a) {
		System.out.println("Table of "+a+" is below");
		for(int i=1;i<=10;i++) {
			int table =a*i;
			System.out.println(table);
		}
	}
}
